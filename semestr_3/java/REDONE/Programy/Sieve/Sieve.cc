// Na podstawie książki Cay Horstmann, Gary Cornell.
// "Java (TM). Podstawy." Wydanie VIII
// Program przeprowadza test wydajności sita Eratostenesa.
// Oblicza wszystkie liczby pierwsze w przedziale do 20 milionów.

#include <bitset>
#include <iostream>
#include <ctime>

using namespace std;

int main()
{
    const int N = 20000000;
    clock_t cstart = clock();

    bitset < N + 1 > b;
    int count = 0;

    for (int j = 2; j <= N; ++j) {
        b.set(j);
    }

    int j = 2;

    while (j * j <= N) {
        if (b.test(j)) {
            count++;
            int k = 2 * j;

            while (k <= N) {
                b.reset(k);
                k += j;
            }
        }
        ++j;
    }

    while (j <= N) {
        if (b.test(j)) {
            count++;
        }
        ++j;
    }

    clock_t cend = clock();
    double millis = 1000.0 * (cend - cstart) / CLOCKS_PER_SEC;

    cout << "Ilość liczb pierwszych:" << count << "\n"
         << millis << " millisekund\n";

    return 0;
}


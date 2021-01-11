// Klasa reprezentująca część. Zawiera opis i numer części.

class Item implements Comparable<Item>
{
    public Item(String aDescription, int aPartNumber)
    {
        description = aDescription;
        partNumber = aPartNumber;
    }

    public String getDescription()
    {
        return description;
    }

    public String toString()
    {
        return "[opis=" + description + ", numer=" + partNumber + "]";
    }

    public boolean equals(Object otherObject)
    {
        if (this == otherObject) {
            return true;
        }
        if (otherObject == null) {
            return false;
        }
        if (getClass() != otherObject.getClass()) {
            return false;
        }
        Item other = (Item) otherObject;
        return description.equals(other.description) && partNumber == other.partNumber;
    }

    public int hashCode()
    {
        return 13 * description.hashCode() + 17 * partNumber;
    }

    public int compareTo(Item other)
    {
        return Integer.compare(partNumber, other.partNumber);
    }

    private String description;
    private int partNumber;
}


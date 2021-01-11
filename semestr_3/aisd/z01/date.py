# Implements a proleptic Gregorian calendar date as a Julian day number.
import datetime
# import calendar
class Date :
    # Creates an object instance for the specified Gregorian date.
    def __init__( self, month = 0, day = 0, year = 0 ):
        if(month == 0 and day == 0 and  year == 0):
            dt = datetime.datetime.today()
            self.month = dt.month
            self.day =   dt.day
            self.year =  dt.year
        else:
            assert self._isValidGregorian(month, day, year), "Invalid Gregorian date."
            self.month = month
            self.day =   day
            self.year =  year

    def _set_julianDay(self):
        tmp = 0
        if month < 3:
            tmp = -1
        self._julianDay = day - 32075 + \
            (1461 * (year + 4800 + tmp) // 4) + \
            (367 * (month - 2 - tmp * 12) // 12) - \
            (3 * ((year + 4900 + tmp) // 100) // 4)
        return self._julianDay

    # Extracts the appropriate Gregorian date component.
    def month( self ):
        return (self._toGregorian())[0] # returning M from (M, d, y)

    def day( self ):
        return (self._toGregorian())[1] # returning D from (m, D, y)

    def year( self ):
        return (self._toGregorian())[2] # returning Y from (m, d, Y)

    # Returns day of the week as an int between 0 (Mon) and 6 (Sun).
    def dayOfWeek( self ):
        month, day, year = self._toGregorian()
        if month < 3 :
            month = month + 12
            year = year - 1
        return ((13 * month + 3) // 5 + day + \
                year + year // 4 - year // 100 + year // 400) % 7

    # Returns the date as a string in Gregorian format.
    def __str__( self ):
        month, day, year = self._toGregorian()
        return "%02d/%02d/%04d" % (month, day, year)

    # Logically compares the two dates.
    def __eq__( self, otherDate ):
        return self._julianDay == otherDate._julianDay

    def __lt__( self, otherDate ):
        return self._julianDay < otherDate._julianDay

    def __le__( self, otherDate ):
        return self._julianDay <= otherDate._julianDay

    # The remaining methods are to be included at this point.
    # ......

    # Returns the Gregorian date as a tuple: (month, day, year).
    def _toGregorian( self ):
        A = self._julianDay + 68569
        B = 4 * A // 146097
        A = A - (146097 * B + 3) // 4
        year = 4000 * (A + 1) // 1461001
        A = A - (1461 * year // 4) + 31
        month = 80 * A // 2447
        day = A - (2447 * month // 80)
        A = month // 11
        month = month + 2 - (12 * A)
        year = 100 * (B - 49) + year + A
        return month, day, year

    def _isValidGregorian(self):
        if (day > 0 and day<=31) and year>=0 and (month > 0 and month <= 12):
            return True
        else:
            return False

    def monthName(self):
        day_name= ['January', 'February', 'March', 'April', 'May', 'June','July', 'August', 'September', 'October', 'November', 'December']
        # return day_name[self.dayOfWeek()]
        pass

    def isLeapYear(self):
        if (year % 4) == 0:
            if (year % 100) == 0:
                if (year % 400) == 0:
                    return True
        return False

    def dayOfWeekName(self):
        day_name= ['Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday','Sunday']
        return day_name[self.dayOfWeek()]

    def dayOfYear(self):
        # temp  = Date(1,1)
        # days = Date()
        # result = days - temp
        pass
    def isWeekday(self):
        if(self.dayOfWeek() == (5 or 6)):
            return True
        return False

    def isSolstice(self):
        month, day, year = self._toGregorian()
        if(day==21 and month==6  or day==22 and month==12):
            return True
        return False

    def asGregorian(self, divchar):
        month, day, year = self._toGregorian()
        return "%02d%c%02d%c%04d" % (month, divchar, day, divchar, year)

    def isEquinox(self):
        month, day, year = self._toGregorian()
        if(day==22 and month==10  or day==20 and month==3):
            return True
        return False

def printCalendar():
    pass

x = Date(2,4,1111)
# x = Date()
print(x.dayOfWeekName())
print(x.asGregorian('|'))
print(x.isWeekday())
# print(x.dayOfYear())

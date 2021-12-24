package day16;

public enum WeekDay {

        SUNDAY("sun"), MONDAY("mon"), TUESDAY("tues"), WEDNESDAY("wed"), THURSDAY("thurs"), FRIDAY("fri"), SATURDAY("sat");

        private String abbrev;
        WeekDay(String abbrev) {
            this.abbrev = abbrev;
        }

        public String getAbbrev() {
            return abbrev;
        }
    }

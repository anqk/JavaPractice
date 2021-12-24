package day17;

public enum MonthDay {
    JANUARY("jan"), FEBRUARY("feb"), MARCH("mar"), APRIL("apr"), MAY("ma"), JUNE("ju"), JULY("jul"), AUGUST("aug"),SEPTEMBER("sep"),OCTOBER("oct"), NOVEMBER("nov"),DECEMBER("dec");

    private String abbrev;

    MonthDay(String abbrev) { this .abbrev = abbrev;}

    public String getAbbrev() {
        return abbrev;
    }
}

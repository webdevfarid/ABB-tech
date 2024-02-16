public enum DayOfWeek
{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }
}

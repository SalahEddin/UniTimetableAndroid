package uclancyprusguide.inspirecenter.org.uclantimetable.data;

import android.support.annotation.NonNull;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * @author Nearchos Paspallis
 *         22/11/2015.
 */
public class TimetableSession implements Serializable, Comparable {
    private String moduleCode;
    private String moduleName;
    private String roomCode;
    private String startTimeFormatted;
    private String endTimeFormatted;
    private String dayOfWeek;
    private int duration;
    private String lecturerName;
    private String sessionDescription;
    private Date startDate;
    private String link;

    // used for session
    public TimetableSession(String moduleCode, String moduleName, String roomCode, String startTimeFormatted, String endTimeFormatted, String dayOfWeek, int duration, String lecturerName, String sessionDescription) {
        this.moduleCode = moduleCode;
        this.moduleName = moduleName;
        this.roomCode = roomCode;
        this.startTimeFormatted = startTimeFormatted;
        this.endTimeFormatted = endTimeFormatted;
        this.dayOfWeek = dayOfWeek;
        this.duration = duration;
        this.lecturerName = lecturerName;
        this.sessionDescription = sessionDescription;
    }

    // used for exams
    public TimetableSession(String moduleCode, String moduleName, String roomCode, String startTimeFormatted, String endTimeFormatted, String dayOfWeek, int duration, String lecturerName, String sessionDescription, Date date) {
        this.moduleCode = moduleCode;
        this.moduleName = moduleName;
        this.roomCode = roomCode;
        this.startTimeFormatted = startTimeFormatted;
        this.endTimeFormatted = endTimeFormatted;
        this.dayOfWeek = dayOfWeek;
        this.duration = duration;
        this.lecturerName = lecturerName;
        this.sessionDescription = sessionDescription;
        this.startDate = date;
    }

    //used for notification
    public TimetableSession(String title, String description, String link, Date date) {
        this.moduleName = title;
        this.sessionDescription = description;
        this.link = link;
        this.startDate = date;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public String getModuleName() {
        return moduleName;
    }

    public String getRoomCode() {
        return roomCode;
    }

    public String getStartTimeFormatted() {
        return startTimeFormatted;
    }

    public String getEndTimeFormatted() {
        return endTimeFormatted;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public int getDuration() {
        return duration;
    }

    public String getLecturerName() {
        return lecturerName == null || lecturerName.isEmpty() ? "N/A" : lecturerName;
    }

    public String getSessionDescription() {
        return sessionDescription;
    }

    public Date getStartDate() {
        return startDate;
    }

    public String getLink() {
        return link;
    }

    @Override
    public int compareTo(@NonNull Object anotherTimetableSession) {
        return startTimeFormatted.compareTo(((TimetableSession) anotherTimetableSession).startTimeFormatted);
    }

    @Override
    public String toString() {
        return "TimetableSession{" +
                "moduleCode='" + moduleCode + '\'' +
                ", moduleName='" + moduleName + '\'' +
                ", roomCode='" + roomCode + '\'' +
                ", startTimeFormatted='" + startTimeFormatted + '\'' +
                ", endTimeFormatted='" + endTimeFormatted + '\'' +
                ", dayOfWeek='" + dayOfWeek + '\'' +
                ", duration=" + duration +
                ", lecturerName='" + lecturerName + '\'' +
                ", sessionDescription='" + sessionDescription + '\'' +
                '}';
    }
}
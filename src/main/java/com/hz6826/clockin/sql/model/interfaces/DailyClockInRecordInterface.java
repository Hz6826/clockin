package com.hz6826.clockin.sql.model.interfaces;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

import java.sql.Date;
import java.sql.Time;

@Environment(EnvType.SERVER)
public interface DailyClockInRecordInterface{

    Date getDate();

    String getUuid();

    Time getTime();

    int getRank();
}

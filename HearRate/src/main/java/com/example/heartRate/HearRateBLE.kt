package com.example.heartRate

import com.jjoe64.graphview.series.DataPoint
import com.jjoe64.graphview.series.LineGraphSeries

object HearRateBLE {
    var name = "Unkown BLE"
    var lastValue = 0
    var values = LineGraphSeries<DataPoint>(arrayOf())
}
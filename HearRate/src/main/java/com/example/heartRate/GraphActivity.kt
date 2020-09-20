package com.example.heartRate

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jjoe64.graphview.series.DataPoint
import kotlinx.android.synthetic.main.activity_graph.*

class GraphActivity : AppCompatActivity() {

    private var datapoints: Array<DataPoint> = emptyArray()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_graph)
        graphView.gridLabelRenderer.gridColor = Color.WHITE
        graphView.gridLabelRenderer.horizontalLabelsColor = Color.WHITE
        graphView.gridLabelRenderer.verticalLabelsColor = Color.WHITE
        graphView.titleColor = Color.WHITE
        graphView.title = HearRateBLE.name
        graphView.getViewport().setXAxisBoundsManual(true);
        graphView.getViewport().setMinX(1.0);
        graphView.getViewport().setMaxX(40.0);

        graphView.addSeries(HearRateBLE.values)
    }
}

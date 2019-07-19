package com.birjuvachhani.locationextensionsample

import org.json.JSONObject
import org.junit.Test

/*
 * Created by Birju Vachhani on 18 July 2019
 * Copyright © 2019 locus-android. All rights reserved.
 */

class MainActivityTest {

    val data = """{"path": "{
    66.933707682325,
    24.876483014725,
    66.943130493164,
    24.862141543725,
    66.943130493164,
    24.862141543725,
    66.885708125774,
    24.7983557697,
    66.652607475339,
    24.774319574644,
    60.05126953125,
    20.842286115167,
    54.684448242188,
    12.567967727957,
    54.569091796875,
    12.329269107613,
    43.26416015625,
    -11.264612212504,
    43.0224609375,
    -11.512322409888,
    41.039428710937,
    -15.400871114077,
    40.294352465028,
    -16.761222134799,
    35.988464355469,
    -23.844140778719,
    35.92529296875,
    -24.837660759535,
    32.71728515625,
    -28.751896559604,
    32.055628740927,
    -29.476657033177,
    31.247484170749,
    -30.365802730651,
    30.399169921875,
    -31.316057884407,
    28.9599609375,
    -32.739519860082,
    27.828564008556,
    -33.525165333088,
    26.724243164062,
    -33.959382290645,
    24.966430664062,
    -34.444054706406,
    19.9951171875,
    -34.946246767964,
    18.314208984375,
    -34.368199449564,
    -47.552828467179,
    -25.776240273816,
    -48.290405273438,
    -25.624192441212,
    -48.33366394043,
    -25.613047870816,
    -48.345336914062,
    -25.546778150624,
    -48.371429443359,
    -25.529430487502,
    -48.398895263672,
    -25.53314805514,
    -48.414688110352,
    -25.542441470125,
    -48.444900512695,
    -25.538104632759,
    -48.472366333008,
    -25.530669689516,
    -48.472366333008,
    -25.530669689516,
    -48.507385253906,
    -25.554053711007
}"
}"""

    @Test
    fun temp() {
        val obj = JSONObject(data)
        val path = obj["path"]
        println(path)
    }
}
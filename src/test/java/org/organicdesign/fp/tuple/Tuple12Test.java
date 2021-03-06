// Copyright 2016 PlanBase Inc. & Glen Peterson
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.organicdesign.fp.tuple;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.organicdesign.fp.TestUtilities.serializeDeserialize;import static org.organicdesign.testUtils.EqualsContract.equalsDistinctHashCode;
import static org.organicdesign.testUtils.EqualsContract.equalsSameHashCode;

// ======================================================================================
// THIS CLASS IS GENERATED BY /tupleGenerator/TupleGenerator.java.  DO NOT EDIT MANUALLY!
// ======================================================================================

public class Tuple12Test {
    @Test public void constructionAndAccess() {
        Tuple12<String,String,String,String,String,String,String,String,String,String,String,String> a = Tuple12.of("1st","2nd","3rd","4th","5th","6th","7th","8th","9th","10th","11th","12th");

        Tuple12<String,String,String,String,String,String,String,String,String,String,String,String> ser = serializeDeserialize(a);

        assertEquals("1st", a._1());
        assertEquals("2nd", a._2());
        assertEquals("3rd", a._3());
        assertEquals("4th", a._4());
        assertEquals("5th", a._5());
        assertEquals("6th", a._6());
        assertEquals("7th", a._7());
        assertEquals("8th", a._8());
        assertEquals("9th", a._9());
        assertEquals("10th", a._10());
        assertEquals("11th", a._11());
        assertEquals("12th", a._12());

        assertEquals("1st", ser._1());
        assertEquals("2nd", ser._2());
        assertEquals("3rd", ser._3());
        assertEquals("4th", ser._4());
        assertEquals("5th", ser._5());
        assertEquals("6th", ser._6());
        assertEquals("7th", ser._7());
        assertEquals("8th", ser._8());
        assertEquals("9th", ser._9());
        assertEquals("10th", ser._10());
        assertEquals("11th", ser._11());
        assertEquals("12th", ser._12());

        equalsDistinctHashCode(a, ser,
                               Tuple12.of("1st","2nd","3rd","4th","5th","6th","7th","8th","9th","10th","11th","12th"),
                               Tuple12.of("wrong","2nd","3rd","4th","5th","6th","7th","8th","9th","10th","11th","12th"));


        equalsDistinctHashCode(a, ser,
                               Tuple12.of("1st","2nd","3rd","4th","5th","6th","7th","8th","9th","10th","11th","12th"),
                               Tuple12.of("1st","wrong","3rd","4th","5th","6th","7th","8th","9th","10th","11th","12th"));


        equalsDistinctHashCode(a, ser,
                               Tuple12.of("1st","2nd","3rd","4th","5th","6th","7th","8th","9th","10th","11th","12th"),
                               Tuple12.of("1st","2nd","wrong","4th","5th","6th","7th","8th","9th","10th","11th","12th"));


        equalsDistinctHashCode(a, ser,
                               Tuple12.of("1st","2nd","3rd","4th","5th","6th","7th","8th","9th","10th","11th","12th"),
                               Tuple12.of("1st","2nd","3rd","wrong","5th","6th","7th","8th","9th","10th","11th","12th"));


        equalsDistinctHashCode(a, ser,
                               Tuple12.of("1st","2nd","3rd","4th","5th","6th","7th","8th","9th","10th","11th","12th"),
                               Tuple12.of("1st","2nd","3rd","4th","wrong","6th","7th","8th","9th","10th","11th","12th"));


        equalsDistinctHashCode(a, ser,
                               Tuple12.of("1st","2nd","3rd","4th","5th","6th","7th","8th","9th","10th","11th","12th"),
                               Tuple12.of("1st","2nd","3rd","4th","5th","wrong","7th","8th","9th","10th","11th","12th"));


        equalsDistinctHashCode(a, ser,
                               Tuple12.of("1st","2nd","3rd","4th","5th","6th","7th","8th","9th","10th","11th","12th"),
                               Tuple12.of("1st","2nd","3rd","4th","5th","6th","wrong","8th","9th","10th","11th","12th"));


        equalsDistinctHashCode(a, ser,
                               Tuple12.of("1st","2nd","3rd","4th","5th","6th","7th","8th","9th","10th","11th","12th"),
                               Tuple12.of("1st","2nd","3rd","4th","5th","6th","7th","wrong","9th","10th","11th","12th"));


        equalsDistinctHashCode(a, ser,
                               Tuple12.of("1st","2nd","3rd","4th","5th","6th","7th","8th","9th","10th","11th","12th"),
                               Tuple12.of("1st","2nd","3rd","4th","5th","6th","7th","8th","wrong","10th","11th","12th"));


        equalsDistinctHashCode(a, ser,
                               Tuple12.of("1st","2nd","3rd","4th","5th","6th","7th","8th","9th","10th","11th","12th"),
                               Tuple12.of("1st","2nd","3rd","4th","5th","6th","7th","8th","9th","wrong","11th","12th"));


        equalsDistinctHashCode(a, ser,
                               Tuple12.of("1st","2nd","3rd","4th","5th","6th","7th","8th","9th","10th","11th","12th"),
                               Tuple12.of("1st","2nd","3rd","4th","5th","6th","7th","8th","9th","10th","wrong","12th"));


        equalsDistinctHashCode(a, ser,
                               Tuple12.of("1st","2nd","3rd","4th","5th","6th","7th","8th","9th","10th","11th","12th"),
                               Tuple12.of("1st","2nd","3rd","4th","5th","6th","7th","8th","9th","10th","11th","wrong"));

        equalsDistinctHashCode(Tuple12.of("1st",null,"3rd",null,"5th",null,"7th",null,"9th",null,"11th",null),
                               serializeDeserialize(Tuple12.of("1st",null,"3rd",null,"5th",null,"7th",null,"9th",null,"11th",null)),
                               Tuple12.of("1st",null,"3rd",null,"5th",null,"7th",null,"9th",null,"11th",null),
                               Tuple12.of("1st",null,"3rd",null,"5th",null,"7th",null,"9th",null,"11th","wrong"));

        equalsDistinctHashCode(Tuple12.of(null,"2nd",null,"4th",null,"6th",null,"8th",null,"10th",null,"12th"),
                               serializeDeserialize(Tuple12.of(null,"2nd",null,"4th",null,"6th",null,"8th",null,"10th",null,"12th")),
                               Tuple12.of(null,"2nd",null,"4th",null,"6th",null,"8th",null,"10th",null,"12th"),
                               Tuple12.of(null,"2nd",null,"4th",null,"6th",null,"8th",null,"10th",null,"wrong"));

        equalsSameHashCode(a, ser,
                           Tuple12.of("1st","2nd","3rd","4th","5th","6th","7th","8th","9th","10th","11th","12th"),
                           Tuple12.of("2nd","1st","3rd","4th","5th","6th","7th","8th","9th","10th","11th","12th"));

        assertEquals("Tuple12(\"1st\",\"2nd\",\"3rd\",\"4th\",\"5th\",\"6th\",\"7th\",\"8th\",\"9th\",\"10th\",\"11th\",\"12th\")", a.toString());
        assertEquals("Tuple12(\"1st\",\"2nd\",\"3rd\",\"4th\",\"5th\",\"6th\",\"7th\",\"8th\",\"9th\",\"10th\",\"11th\",\"12th\")", ser.toString());
    }
}

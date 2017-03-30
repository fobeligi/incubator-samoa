package org.apache.samoa;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.junit.Test;

public class BoostVHTTest {
  
  @Test
  public void testBoostVHTLocal() throws Exception {
    TestParams vhtConfig = new TestParams.Builder()
            .inputInstances(200_000)
            .samplingSize(20_000)
            .evaluationInstances(200_000)
            .classifiedInstances(200_000)
            .classificationsCorrect(75f)
            .kappaStat(0f)
            .kappaTempStat(0f)
            .cliStringTemplate(TestParams.Templates.PREQEVAL_BoostVHT_RANDOMTREE)
            .resultFilePollTimeout(10)
            .prePollWait(10)
            .taskClassName(LocalDoTask.class.getName())
            .build();
    TestUtils.test(vhtConfig);
  }
}

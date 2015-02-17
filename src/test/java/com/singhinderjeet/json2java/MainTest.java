/*
 * Copyright (C) 2015 Inderjeet Singh
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.singhinderjeet.json2java;

import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.junit.Test;

/**
 * Unit tests for {@link Main}.
 *
 * @author Inderjeet Singh
 */
public class MainTest {

  @Test
  public void testReverseGeocodingJson() throws Exception {
    InputStream json = MainTest.class.getResourceAsStream("/reversegeocoding.json");
    File dir = File.createTempFile("json2java", "src").getParentFile();
    Main main = new Main("com.reversegeocoding", "ReverseGeocodingResults", dir);
    main.generate(new InputStreamReader(json, "UTF-8"));
  }

  @Test
  public void testTmsLineupsJson() throws Exception {
    InputStream json = MainTest.class.getResourceAsStream("/tms-lineups.json");
    File dir = File.createTempFile("json2java", "src").getParentFile();
    Main main = new Main("com.tms.lineups", "Lineup", dir);
    main.generate(new InputStreamReader(json, "UTF-8"));
  }
}
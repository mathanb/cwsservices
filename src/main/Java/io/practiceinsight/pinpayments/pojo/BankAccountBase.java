/*
 * Copyright (c) 2017 Practice Insight
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

package io.practiceinsight.pinpayments.pojo;

import com.google.gson.annotations.SerializedName;
import javax.annotation.Nullable;
import org.immutables.gson.Gson;

/**
 * @author delight.wjk@gmail.com
 */
@Gson.TypeAdapters(fieldNamingStrategy = true)
public interface BankAccountBase {

  @Nullable
  @SerializedName("bank_name")
  String bankName();

  String name();

  String bsb();

  String number();

}

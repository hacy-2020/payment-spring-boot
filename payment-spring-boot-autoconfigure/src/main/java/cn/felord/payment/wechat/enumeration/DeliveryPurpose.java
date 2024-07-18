/*
 *  Copyright 2019-2022 felord.cn
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       https://www.apache.org/licenses/LICENSE-2.0
 *  Website:
 *       https://felord.cn
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package cn.felord.payment.wechat.enumeration;

/**
 * The enum Delivery purpose.
 *
 * @author felord.cn
 * @since 1.0.19.RELEASE
 */
public enum DeliveryPurpose {
    /**
     * 拉用户回店消费
     */
    OFF_LINE_PAY,
    /**
     * 引导用户前往小程序消费
     */
    JUMP_MINI_APP
}
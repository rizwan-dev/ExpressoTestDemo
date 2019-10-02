<?xml version="1.0" encoding="utf-8"?>
<!--
/* //device/apps/common/res/anim/fade_in.xml
**
** Copyright 2007, The Android Open Source Project
**
** Licensed under the Apache License, Version 2.0 (the "License"); 
** you may not use this file except in compliance with the License. 
** You may obtain a copy of the License at 
**
**     http://www.apache.org/licenses/LICENSE-2.0 
**
** Unless required by applicable law or agreed to in writing, software 
** distributed under the License is distributed on an "AS IS" BASIS, 
** WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
** See the License for the specific language governing permissions and 
** limitations under the License.
*/
-->

<set xmlns:android="http://schemas.android.com/apk/res/android"
        android:interpolator="@interpolator/decelerate_quad">
    <scale android:fromXScale="2.0" android:toXScale="1.0"
           android:fromYScale="2.0" android:toYScale="1.0"
           android:pivotX="50%" android:pivotY="50%"
           android:duration="@android:integer/config_shortAnimTime" />
    <translate android:fromYDelta="100%" android:toYDelta="0"
            android:duration="@android:integer/config_shortAnimTime"/>
</set>
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
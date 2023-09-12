/*
 * Copyright (C) 2023 The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package org.lineageos.settings.device.sound

import android.os.Bundle
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import org.lineageos.settings.device.R

class AudioSettingsFragment : PreferenceFragmentCompat(), Preference.OnPreferenceChangeListener {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.advanced_audio_settings, rootKey)

        val yourPreference: Preference? = findPreference("android:key")
        yourPreference?.onPreferenceChangeListener = this
    }

    override fun onPreferenceChange(preference: Preference?, newValue: Any?): Boolean {
        return true
    }
}
 
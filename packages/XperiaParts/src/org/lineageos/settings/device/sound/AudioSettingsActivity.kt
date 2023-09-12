/*
 * Copyright (C) 2023 The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package org.lineageos.settings.device.sound

import android.os.Bundle
import androidx.fragment.app.FragmentManager
import com.android.settingslib.collapsingtoolbar.CollapsingToolbarBaseActivity
import org.lineageos.settings.device.R

class AudioSettingsActivity : CollapsingToolbarBaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val fragmentManager: FragmentManager = supportFragmentManager
        fragmentManager.beginTransaction()
                .replace(R.id.content_frame, AudioSettingsFragment(), TAG)
                .commit()
    }

    companion object {
        private const val TAG = "AdvancedAudioSettingsActivity"
    }
}
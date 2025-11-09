package io.flutter.plugin.common;

import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public interface PluginRegistry {

    public interface ActivityResultListener {
        boolean onActivityResult(int i, int i2, @Nullable Intent intent);
    }

    public interface NewIntentListener {
        boolean onNewIntent(@NonNull Intent intent);
    }

    public interface RequestPermissionsResultListener {
        boolean onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr);
    }

    public interface UserLeaveHintListener {
        void onUserLeaveHint();
    }

    public interface WindowFocusChangedListener {
        void onWindowFocusChanged(boolean z);
    }
}

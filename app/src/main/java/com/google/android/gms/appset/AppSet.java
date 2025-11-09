package com.google.android.gms.appset;

import OooO0oO.OooOOO0;
import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public final class AppSet {
    private AppSet() {
    }

    @NonNull
    public static AppSetIdClient getClient(@NonNull Context context) {
        return new OooOOO0(context, 6);
    }
}

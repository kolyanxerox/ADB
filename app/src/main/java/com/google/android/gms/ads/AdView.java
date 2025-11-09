package com.google.android.gms.ads;

import Oooo00O.o000000O;
import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public final class AdView extends BaseAdView {
    public AdView(@NonNull Context context) {
        super(context);
        o000000O.OooO(context, "Context cannot be null");
    }

    @NonNull
    public final VideoController zza() {
        return this.f15901OooOo0O.zzf();
    }

    public AdView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
    }
}

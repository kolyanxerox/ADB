package com.iab.omid.library.unity3d.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.unity3d.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.unity3d.weakreference.C2623a;

/* renamed from: com.iab.omid.library.unity3d.internal.e */
/* loaded from: classes2.dex */
public class C2592e {

    /* renamed from: a */
    private final C2623a f3758a;

    /* renamed from: b */
    private final String f3759b;

    /* renamed from: c */
    private final FriendlyObstructionPurpose f3760c;

    /* renamed from: d */
    private final String f3761d;

    public C2592e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f3758a = new C2623a(view);
        this.f3759b = view.getClass().getCanonicalName();
        this.f3760c = friendlyObstructionPurpose;
        this.f3761d = str;
    }

    /* renamed from: a */
    public String m4553a() {
        return this.f3761d;
    }

    /* renamed from: b */
    public FriendlyObstructionPurpose m4554b() {
        return this.f3760c;
    }

    /* renamed from: c */
    public C2623a m4555c() {
        return this.f3758a;
    }

    /* renamed from: d */
    public String m4556d() {
        return this.f3759b;
    }
}

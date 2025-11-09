package com.iab.omid.library.applovin.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.applovin.weakreference.C2526a;

/* renamed from: com.iab.omid.library.applovin.internal.e */
/* loaded from: classes2.dex */
public class C2492e {

    /* renamed from: a */
    private final C2526a f3487a;

    /* renamed from: b */
    private final String f3488b;

    /* renamed from: c */
    private final FriendlyObstructionPurpose f3489c;

    /* renamed from: d */
    private final String f3490d;

    public C2492e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f3487a = new C2526a(view);
        this.f3488b = view.getClass().getCanonicalName();
        this.f3489c = friendlyObstructionPurpose;
        this.f3490d = str;
    }

    /* renamed from: a */
    public String m4044a() {
        return this.f3490d;
    }

    /* renamed from: b */
    public FriendlyObstructionPurpose m4045b() {
        return this.f3489c;
    }

    /* renamed from: c */
    public C2526a m4046c() {
        return this.f3487a;
    }

    /* renamed from: d */
    public String m4047d() {
        return this.f3488b;
    }
}

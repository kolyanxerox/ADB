package com.iab.omid.library.ironsrc.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.ironsrc.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.ironsrc.weakreference.C2577a;

/* renamed from: com.iab.omid.library.ironsrc.internal.e */
/* loaded from: classes2.dex */
public class C2543e {

    /* renamed from: a */
    private final C2577a f3622a;

    /* renamed from: b */
    private final String f3623b;

    /* renamed from: c */
    private final FriendlyObstructionPurpose f3624c;

    /* renamed from: d */
    private final String f3625d;

    public C2543e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f3622a = new C2577a(view);
        this.f3623b = view.getClass().getCanonicalName();
        this.f3624c = friendlyObstructionPurpose;
        this.f3625d = str;
    }

    /* renamed from: a */
    public String m4297a() {
        return this.f3625d;
    }

    /* renamed from: b */
    public FriendlyObstructionPurpose m4298b() {
        return this.f3624c;
    }

    /* renamed from: c */
    public C2577a m4299c() {
        return this.f3622a;
    }

    /* renamed from: d */
    public String m4300d() {
        return this.f3623b;
    }
}

package com.iab.omid.library.applovin.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.iab.omid.library.applovin.internal.f */
/* loaded from: classes2.dex */
public class C2493f {

    /* renamed from: b */
    private static final Pattern f3491b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a */
    private final List<C2492e> f3492a = new ArrayList();

    /* renamed from: b */
    private C2492e m4050b(View view) {
        for (C2492e c2492e : this.f3492a) {
            if (c2492e.m4046c().get() == view) {
                return c2492e;
            }
        }
        return null;
    }

    /* renamed from: a */
    public List<C2492e> m4051a() {
        return this.f3492a;
    }

    /* renamed from: c */
    public void m4054c(View view) {
        m4048a(view);
        C2492e c2492eM4050b = m4050b(view);
        if (c2492eM4050b != null) {
            this.f3492a.remove(c2492eM4050b);
        }
    }

    /* renamed from: a */
    private void m4048a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: b */
    public void m4053b() {
        this.f3492a.clear();
    }

    /* renamed from: a */
    public void m4052a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        m4048a(view);
        m4049a(str);
        if (m4050b(view) == null) {
            this.f3492a.add(new C2492e(view, friendlyObstructionPurpose, str));
        }
    }

    /* renamed from: a */
    private void m4049a(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f3491b.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }
}

package com.iab.omid.library.ironsrc.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.ironsrc.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.iab.omid.library.ironsrc.internal.f */
/* loaded from: classes2.dex */
public class C2544f {

    /* renamed from: b */
    private static final Pattern f3626b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a */
    private final List<C2543e> f3627a = new ArrayList();

    /* renamed from: b */
    private C2543e m4303b(View view) {
        for (C2543e c2543e : this.f3627a) {
            if (c2543e.m4299c().get() == view) {
                return c2543e;
            }
        }
        return null;
    }

    /* renamed from: a */
    public List<C2543e> m4304a() {
        return this.f3627a;
    }

    /* renamed from: c */
    public void m4307c(View view) {
        m4301a(view);
        C2543e c2543eM4303b = m4303b(view);
        if (c2543eM4303b != null) {
            this.f3627a.remove(c2543eM4303b);
        }
    }

    /* renamed from: a */
    private void m4301a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: b */
    public void m4306b() {
        this.f3627a.clear();
    }

    /* renamed from: a */
    public void m4305a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        m4301a(view);
        m4302a(str);
        if (m4303b(view) == null) {
            this.f3627a.add(new C2543e(view, friendlyObstructionPurpose, str));
        }
    }

    /* renamed from: a */
    private void m4302a(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f3626b.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }
}

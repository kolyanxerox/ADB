package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.c0 */
/* loaded from: classes.dex */
public abstract class AbstractCallableC0991c0 implements Callable {

    /* renamed from: a */
    protected final C1220k f453a;

    /* renamed from: b */
    protected final String f454b;

    /* renamed from: c */
    protected final C1240o f455c;

    /* renamed from: e */
    protected final AtomicBoolean f457e = new AtomicBoolean();

    /* renamed from: d */
    private final Context f456d = C1220k.m2824o();

    public AbstractCallableC0991c0(String str, C1220k c1220k) {
        this.f454b = str;
        this.f453a = c1220k;
        this.f455c = c1220k.m2847O();
    }

    /* renamed from: a */
    public Context m441a() {
        return this.f456d;
    }

    /* renamed from: a */
    public void m442a(boolean z) {
        this.f457e.set(z);
    }
}

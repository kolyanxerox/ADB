package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class o0OO00o0 extends ContentObserver {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f26542OooO00o = 1;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f26543OooO0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00o0(o0OO0o o0oo0o) {
        super(null);
        this.f26543OooO0O0 = o0oo0o;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        switch (this.f26542OooO00o) {
            case 0:
                ((AtomicBoolean) ((o000O0Oo.OooO0o) this.f26543OooO0O0).f30138OooOo0o).set(true);
                return;
            default:
                o0OO0o o0oo0o = (o0OO0o) this.f26543OooO0O0;
                synchronized (o0oo0o.f26552OooO0o) {
                    o0oo0o.f26554OooO0oO = null;
                    o0oo0o.f26550OooO0OO.run();
                }
                synchronized (o0oo0o) {
                    try {
                        Iterator it = o0oo0o.f26555OooO0oo.iterator();
                        if (it.hasNext()) {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                            throw null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00o0(o000O0Oo.OooO0o oooO0o) {
        super(null);
        Objects.requireNonNull(oooO0o);
        this.f26543OooO0O0 = oooO0o;
    }
}

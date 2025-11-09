package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes2.dex */
public final class o0O00 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f21866OooO00o = new byte[8];

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayDeque f21867OooO0O0 = new ArrayDeque();

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final o0O00O f21868OooO0OO = new o0O00O(0);

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public wj0 f21869OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public int f21870OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public int f21871OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public long f21872OooO0oO;

    public final long OooO00o(o000000 o000000Var, int i) throws EOFException, InterruptedIOException {
        o000000Var.OooO0o0(this.f21866OooO00o, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (r0[i2] & ForkServer.ERROR);
        }
        return j;
    }
}

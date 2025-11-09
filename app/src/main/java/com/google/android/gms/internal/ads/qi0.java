package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class qi0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final sj0 f23617OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final AtomicLong f23618OooO0O0 = new AtomicLong();

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayDeque f23619OooO0OO = new ArrayDeque();

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final PriorityQueue f23620OooO0Oo = new PriorityQueue();

    /* renamed from: OooO0o0, reason: collision with root package name */
    public int f23621OooO0o0 = -1;

    public qi0(sj0 sj0Var) {
        this.f23617OooO00o = sj0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r8 < r0.f18614OooOo0o) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO00o(long r8, com.google.android.gms.internal.ads.r40 r10) {
        /*
            r7 = this;
            int r0 = r7.f23621OooO0o0
            if (r0 == 0) goto L72
            java.util.PriorityQueue r1 = r7.f23620OooO0Oo
            r2 = -1
            if (r0 == r2) goto L20
            int r0 = r1.size()
            int r3 = r7.f23621OooO0o0
            if (r0 < r3) goto L20
            java.lang.Object r0 = r1.peek()
            com.google.android.gms.internal.ads.ei0 r0 = (com.google.android.gms.internal.ads.ei0) r0
            int r3 = com.google.android.gms.internal.ads.i80.f19994OooO00o
            long r3 = r0.f18614OooOo0o
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 >= 0) goto L20
            goto L72
        L20:
            java.util.ArrayDeque r0 = r7.f23619OooO0OO
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L2e
            com.google.android.gms.internal.ads.ei0 r0 = new com.google.android.gms.internal.ads.ei0
            r0.<init>()
            goto L34
        L2e:
            java.lang.Object r0 = r0.poll()
            com.google.android.gms.internal.ads.ei0 r0 = (com.google.android.gms.internal.ads.ei0) r0
        L34:
            java.util.concurrent.atomic.AtomicLong r3 = r7.f23618OooO0O0
            long r3 = r3.getAndIncrement()
            r0.getClass()
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            r6 = 0
            if (r5 == 0) goto L49
            r5 = 1
            goto L4a
        L49:
            r5 = r6
        L4a:
            com.google.android.gms.internal.ads.af0.OooooO0(r5)
            r0.f18614OooOo0o = r8
            r0.f18612OooOo = r3
            int r8 = r10.OooOOOO()
            com.google.android.gms.internal.ads.r40 r9 = r0.f18613OooOo0O
            r9.OooO0oO(r8)
            byte[] r8 = r10.f23745OooO00o
            int r3 = r10.f23746OooO0O0
            byte[] r9 = r9.f23745OooO00o
            int r10 = r10.OooOOOO()
            java.lang.System.arraycopy(r8, r3, r9, r6, r10)
            r1.add(r0)
            int r8 = r7.f23621OooO0o0
            if (r8 == r2) goto L71
            r7.OooO0O0(r8)
        L71:
            return
        L72:
            com.google.android.gms.internal.ads.sj0 r0 = r7.f23617OooO00o
            r0.OooO0OO(r8, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qi0.OooO00o(long, com.google.android.gms.internal.ads.r40):void");
    }

    public final void OooO0O0(int i) {
        while (true) {
            PriorityQueue priorityQueue = this.f23620OooO0Oo;
            if (priorityQueue.size() <= i) {
                return;
            }
            ei0 ei0Var = (ei0) priorityQueue.poll();
            int i2 = i80.f19994OooO00o;
            this.f23617OooO00o.OooO0OO(ei0Var.f18614OooOo0o, ei0Var.f18613OooOo0O);
            this.f23619OooO0OO.push(ei0Var);
        }
    }
}

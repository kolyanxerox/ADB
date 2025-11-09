package OoooOOO;

import Oooo00O.o000000O;
import Oooo0oO.o00000;
import android.content.SharedPreferences;
import com.google.android.gms.internal.ads.C1822md;
import com.google.android.gms.internal.ads.C2192wd;
import com.google.android.gms.internal.ads.C2229xd;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import o0000Oo.OooOO0O;
import o0000Oo.Oooo0;
import o0000Oo.o00Ooo;
import o0000Oo.o00oO0o;

/* loaded from: classes2.dex */
public final class o0oOo0O0 implements o00oO0o {

    /* renamed from: OooO00o */
    public long f14592OooO00o;

    /* renamed from: OooO0O0 */
    public Object f14593OooO0O0;

    /* renamed from: OooO0OO */
    public Object f14594OooO0OO;

    /* renamed from: OooO0Oo */
    public Object f14595OooO0Oo;

    /* renamed from: OooO0o0 */
    public final Object f14596OooO0o0;

    public /* synthetic */ o0oOo0O0(C2229xd c2229xd, ArrayList arrayList, long j, C2192wd c2192wd, C1822md c1822md) {
        this.f14593OooO0O0 = c2229xd;
        this.f14594OooO0OO = arrayList;
        this.f14592OooO00o = j;
        this.f14595OooO0Oo = c2192wd;
        this.f14596OooO0o0 = c1822md;
    }

    @Override // o0000Oo.o00oO0o
    public ByteBuffer OooO00o() {
        return ((ByteBuffer) this.f14596OooO0o0).asReadOnlyBuffer();
    }

    @Override // o0000Oo.o00oO0o
    public synchronized void OooO0O0(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
        try {
            ((Cipher) this.f14594OooO0OO).init(1, (SecretKeySpec) this.f14593OooO0O0, OooOO0O.OooO((byte[]) this.f14595OooO0Oo, this.f14592OooO00o, false));
            this.f14592OooO00o++;
            if (byteBuffer2.hasRemaining()) {
                ((Cipher) this.f14594OooO0OO).update(byteBuffer, byteBuffer3);
                ((Cipher) this.f14594OooO0OO).doFinal(byteBuffer2, byteBuffer3);
            } else {
                ((Cipher) this.f14594OooO0OO).doFinal(byteBuffer, byteBuffer3);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // o0000Oo.o00oO0o
    public synchronized void OooO0OO(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        ((Cipher) this.f14594OooO0OO).init(1, (SecretKeySpec) this.f14593OooO0O0, OooOO0O.OooO((byte[]) this.f14595OooO0Oo, this.f14592OooO00o, true));
        this.f14592OooO00o++;
        ((Cipher) this.f14594OooO0OO).doFinal(byteBuffer, byteBuffer2);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean OooO0Oo(long r11, com.google.android.gms.internal.measurement.o0O00OO r13) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f14595OooO0Oo
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto Ld
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f14595OooO0Oo = r0
        Ld:
            java.lang.Object r0 = r10.f14594OooO0OO
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto L1a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f14594OooO0OO = r0
        L1a:
            java.lang.Object r0 = r10.f14595OooO0Oo
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 != 0) goto L45
            java.lang.Object r0 = r10.f14595OooO0Oo
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.measurement.o0O00OO r0 = (com.google.android.gms.internal.measurement.o0O00OO) r0
            long r2 = r0.OooOo0()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            r6 = 60
            long r2 = r2 / r6
            long r2 = r2 / r6
            long r8 = r13.OooOo0()
            long r8 = r8 / r4
            long r8 = r8 / r6
            long r8 = r8 / r6
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 != 0) goto Lcc
        L45:
            long r2 = r10.f14592OooO00o
            int r0 = r13.OooOO0O()
            long r4 = (long) r0
            long r2 = r2 + r4
            java.lang.Object r0 = r10.f14596OooO0o0
            OoooOOO.oOO0000 r0 = (OoooOOO.oOO0000) r0
            OoooOOO.o00O0OO r4 = r0.OooooOO()
            OoooOOO.o0O000 r5 = OoooOOO.o0O000O.f14305o0000OoO
            r6 = 0
            boolean r4 = r4.OooOo0(r6, r5)
            if (r4 == 0) goto L81
            java.lang.Object r4 = r10.f14595OooO0Oo
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L9a
            r0.OooooOO()
            OoooOOO.o0O000 r4 = OoooOOO.o0O000O.f14233OooOO0
            java.lang.Object r4 = r4.OooO00o(r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r4 = java.lang.Math.max(r1, r4)
            long r4 = (long) r4
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 >= 0) goto Lcc
            goto L9a
        L81:
            r0.OooooOO()
            OoooOOO.o0O000 r4 = OoooOOO.o0O000O.f14233OooOO0
            java.lang.Object r4 = r4.OooO00o(r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r4 = java.lang.Math.max(r1, r4)
            long r4 = (long) r4
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L9a
            goto Lcc
        L9a:
            r10.f14592OooO00o = r2
            java.lang.Object r2 = r10.f14595OooO0Oo
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.add(r13)
            java.lang.Object r13 = r10.f14594OooO0OO
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r13.add(r11)
            java.lang.Object r11 = r10.f14595OooO0Oo
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            int r11 = r11.size()
            r0.OooooOO()
            OoooOOO.o0O000 r12 = OoooOOO.o0O000O.f14234OooOO0O
            java.lang.Object r12 = r12.OooO00o(r6)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r13 = 1
            int r12 = java.lang.Math.max(r13, r12)
            if (r11 < r12) goto Lcd
        Lcc:
            return r1
        Lcd:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooOOO.o0oOo0O0.OooO0Oo(long, com.google.android.gms.internal.measurement.o0O00OO):boolean");
    }

    public void OooO0o0() {
        o0O o0o = (o0O) this.f14596OooO0o0;
        o0o.OooOO0O();
        ((o0OO0oO0) o0o.f14574OooOo0O).f14527Oooo000.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = o0o.OooOOOO().edit();
        editorEdit.remove((String) this.f14594OooO0OO);
        editorEdit.remove((String) this.f14595OooO0Oo);
        editorEdit.putLong((String) this.f14593OooO0O0, jCurrentTimeMillis);
        editorEdit.apply();
    }

    public /* synthetic */ o0oOo0O0(o0O o0o, long j) {
        Objects.requireNonNull(o0o);
        this.f14596OooO0o0 = o0o;
        o000000O.OooO0o0("health_monitor");
        o000000O.OooO0O0(j > 0);
        this.f14593OooO0O0 = "health_monitor:start";
        this.f14594OooO0OO = "health_monitor:count";
        this.f14595OooO0Oo = "health_monitor:value";
        this.f14592OooO00o = j;
    }

    public /* synthetic */ o0oOo0O0(oOO0000 ooo0000) {
        Objects.requireNonNull(ooo0000);
        this.f14596OooO0o0 = ooo0000;
    }

    public o0oOo0O0(OooOO0O oooOO0O, byte[] bArr) {
        this.f14592OooO00o = 0L;
        this.f14594OooO0OO = (Cipher) Oooo0.f29463OooO0O0.f29465OooO00o.OooO00o("AES/GCM/NoPadding");
        this.f14592OooO00o = 0L;
        byte[] bArrOooO00o = o00Ooo.OooO00o(oooOO0O.f29445OooO00o);
        byte[] bArrOooO00o2 = o00Ooo.OooO00o(7);
        this.f14595OooO0Oo = bArrOooO00o2;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(oooOO0O.OooO0o0());
        this.f14596OooO0o0 = byteBufferAllocate;
        byteBufferAllocate.put((byte) oooOO0O.OooO0o0());
        byteBufferAllocate.put(bArrOooO00o);
        byteBufferAllocate.put(bArrOooO00o2);
        byteBufferAllocate.flip();
        this.f14593OooO0O0 = new SecretKeySpec(o00000.OooO0O0(oooOO0O.f29448OooO0Oo, oooOO0O.f29449OooO0o0, bArrOooO00o, bArr, oooOO0O.f29445OooO00o), "AES");
    }
}

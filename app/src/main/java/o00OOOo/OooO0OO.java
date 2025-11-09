package o00OOOO;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import o00OOO0.o0OoOo0;

/* loaded from: classes3.dex */
public final class OooO0OO extends OooO00o {

    /* renamed from: OooOoO, reason: collision with root package name */
    public final o0OoOo0 f32358OooOoO;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public long f32359OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f32360OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public boolean f32361OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(OooOO0O oooOO0O, o0OoOo0 o0oooo0) {
        super(oooOO0O);
        this.f32360OooOoo = oooOO0O;
        this.f32359OooOoOO = -1L;
        this.f32361OooOoo0 = true;
        this.f32358OooOoO = o0oooo0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
    
        if (r10.f32361OooOoo0 == false) goto L30;
     */
    @Override // o00OOOO.OooO00o, o00OOOoO.o0O0ooO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long OooO0oO(long r11, o00OOOoO.o0000 r13) throws java.lang.InterruptedException, java.io.IOException, java.lang.NumberFormatException {
        /*
            r10 = this;
            r0 = 0
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 < 0) goto Lc8
            boolean r2 = r10.f32353OooOo0o
            if (r2 != 0) goto Lc0
            boolean r2 = r10.f32361OooOoo0
            r3 = -1
            if (r2 != 0) goto L11
            goto L7a
        L11:
            long r5 = r10.f32359OooOoOO
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r7 = 0
            if (r2 == 0) goto L1c
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 != 0) goto L7b
        L1c:
            java.lang.String r2 = "expected chunk size and optional extensions but was \""
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            o00OOOO.OooOO0O r6 = r10.f32360OooOoo
            if (r5 == 0) goto L2e
            o00OOOoO.o000O0O0 r5 = r6.f32369OooO0OO
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r5.readUtf8LineStrict(r8)
        L2e:
            o00OOOoO.o000O0O0 r5 = r6.f32369OooO0OO     // Catch: java.lang.NumberFormatException -> L5a
            long r8 = r5.readHexadecimalUnsignedLong()     // Catch: java.lang.NumberFormatException -> L5a
            r10.f32359OooOoOO = r8     // Catch: java.lang.NumberFormatException -> L5a
            o00OOOoO.o000O0O0 r5 = r6.f32369OooO0OO     // Catch: java.lang.NumberFormatException -> L5a
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r5 = r5.readUtf8LineStrict(r8)     // Catch: java.lang.NumberFormatException -> L5a
            java.lang.String r5 = r5.trim()     // Catch: java.lang.NumberFormatException -> L5a
            long r8 = r10.f32359OooOoOO     // Catch: java.lang.NumberFormatException -> L5a
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 < 0) goto L9a
            boolean r8 = r5.isEmpty()     // Catch: java.lang.NumberFormatException -> L5a
            if (r8 != 0) goto L5c
            java.lang.String r8 = ";"
            boolean r8 = r5.startsWith(r8)     // Catch: java.lang.NumberFormatException -> L5a
            if (r8 == 0) goto L9a
            goto L5c
        L5a:
            r11 = move-exception
            goto Lb6
        L5c:
            long r8 = r10.f32359OooOoOO
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 != 0) goto L76
            r10.f32361OooOoo0 = r7
            o00OOO0.oo000o r0 = r6.f32367OooO00o
            o00OOO0.OooO0O0 r0 = r0.f32310OooOoo
            o00OOO0.o000oOoO r1 = r6.OooO0o0()
            o00OOO0.o0OoOo0 r2 = r10.f32358OooOoO
            o00OOOO0.OooO.OooO0Oo(r0, r2, r1)
            r0 = 1
            r1 = 0
            r10.OooO00o(r1, r0)
        L76:
            boolean r0 = r10.f32361OooOoo0
            if (r0 != 0) goto L7b
        L7a:
            return r3
        L7b:
            long r0 = r10.f32359OooOoOO
            long r11 = java.lang.Math.min(r11, r0)
            long r11 = super.OooO0oO(r11, r13)
            int r13 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r13 == 0) goto L8f
            long r0 = r10.f32359OooOoOO
            long r0 = r0 - r11
            r10.f32359OooOoOO = r0
            return r11
        L8f:
            java.net.ProtocolException r11 = new java.net.ProtocolException
            java.lang.String r12 = "unexpected end of stream"
            r11.<init>(r12)
            r10.OooO00o(r11, r7)
            throw r11
        L9a:
            java.net.ProtocolException r11 = new java.net.ProtocolException     // Catch: java.lang.NumberFormatException -> L5a
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L5a
            r12.<init>(r2)     // Catch: java.lang.NumberFormatException -> L5a
            long r0 = r10.f32359OooOoOO     // Catch: java.lang.NumberFormatException -> L5a
            r12.append(r0)     // Catch: java.lang.NumberFormatException -> L5a
            r12.append(r5)     // Catch: java.lang.NumberFormatException -> L5a
            java.lang.String r13 = "\""
            r12.append(r13)     // Catch: java.lang.NumberFormatException -> L5a
            java.lang.String r12 = r12.toString()     // Catch: java.lang.NumberFormatException -> L5a
            r11.<init>(r12)     // Catch: java.lang.NumberFormatException -> L5a
            throw r11     // Catch: java.lang.NumberFormatException -> L5a
        Lb6:
            java.net.ProtocolException r12 = new java.net.ProtocolException
            java.lang.String r11 = r11.getMessage()
            r12.<init>(r11)
            throw r12
        Lc0:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "closed"
            r11.<init>(r12)
            throw r11
        Lc8:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "byteCount < 0: "
            java.lang.String r11 = OooO0oO.OooOo.OooO0oo(r11, r0)
            r13.<init>(r11)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: o00OOOO.OooO0OO.OooO0oO(long, o00OOOoO.o0000):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        boolean zOooOOo0;
        if (this.f32353OooOo0o) {
            return;
        }
        if (this.f32361OooOoo0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            try {
                zOooOOo0 = o00OOO0O.OooO0OO.OooOOo0(this, 100);
            } catch (IOException unused) {
                zOooOOo0 = false;
            }
            if (!zOooOOo0) {
                OooO00o(null, false);
            }
        }
        this.f32353OooOo0o = true;
    }
}

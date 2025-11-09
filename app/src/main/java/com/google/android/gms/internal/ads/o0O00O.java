package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes2.dex */
public final class o0O00O implements o0O0O0o0, im0 {

    /* renamed from: OooOo, reason: collision with root package name */
    public Object f21878OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public int f21879OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public int f21880OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public static final long[] f21876OooOoO0 = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: OooOoO, reason: collision with root package name */
    public static final byte[] f21875OooOoO = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};

    /* renamed from: OooOoOO, reason: collision with root package name */
    public static final byte[] f21877OooOoOO = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    public o0O00O(int i) {
        switch (i) {
            case 5:
                this.f21878OooOo = new dx0(0);
                this.f21879OooOo0O = 8000;
                this.f21880OooOo0o = 8000;
                break;
            default:
                this.f21878OooOo = new byte[8];
                break;
        }
    }

    public static long OooO0OO(byte[] bArr, int i, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            j &= ~f21876OooOoO0[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    public static final void OooO0Oo(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(true != z ? (byte) 0 : (byte) 2);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        long j2 = i2;
        ii0.OooooOo(j2, "out of range: %s", (j2 >> 8) == 0);
        byteBuffer.put((byte) j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f6, code lost:
    
        if (r2.size() < r12) goto L98;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String OooO00o(java.util.ArrayList r18, java.util.ArrayList r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o0O00O.OooO00o(java.util.ArrayList, java.util.ArrayList):java.lang.String");
    }

    public void OooO0O0(c41 c41Var, List list) {
        int length;
        int i;
        ByteBuffer byteBuffer;
        int i2;
        ByteBuffer byteBuffer2 = c41Var.f17682OooO0o0;
        byteBuffer2.getClass();
        if (byteBuffer2.limit() - c41Var.f17682OooO0o0.position() == 0) {
            return;
        }
        byte[] bArr = null;
        if (this.f21879OooOo0O == 2 && (list.size() == 1 || list.size() == 3)) {
            bArr = (byte[]) list.get(0);
        }
        ByteBuffer byteBuffer3 = c41Var.f17682OooO0o0;
        int iPosition = byteBuffer3.position();
        int iLimit = byteBuffer3.limit();
        int i3 = iLimit - iPosition;
        int i4 = (i3 + 255) / 255;
        int i5 = i4 + 27 + i3;
        if (this.f21879OooOo0O == 2) {
            length = bArr != null ? bArr.length + 28 : 47;
            i5 += length + 44;
        } else {
            length = 0;
        }
        if (((ByteBuffer) this.f21878OooOo).capacity() < i5) {
            this.f21878OooOo = ByteBuffer.allocate(i5).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            ((ByteBuffer) this.f21878OooOo).clear();
        }
        ByteBuffer byteBuffer4 = (ByteBuffer) this.f21878OooOo;
        if (this.f21879OooOo0O == 2) {
            if (bArr != null) {
                byteBuffer = byteBuffer4;
                i2 = 22;
                OooO0Oo(byteBuffer, 0L, 0, 1, true);
                int length2 = bArr.length;
                i = iPosition;
                long j = length2;
                ii0.OooooOo(j, "out of range: %s", (j >> 8) == 0);
                byteBuffer.put((byte) j);
                byteBuffer.put(bArr);
                int i6 = length2 + 28;
                byteBuffer.putInt(22, i80.OooOO0O(byteBuffer.arrayOffset(), byteBuffer.array(), i6, 0));
                byteBuffer.position(i6);
            } else {
                i = iPosition;
                byteBuffer = byteBuffer4;
                i2 = 22;
                byteBuffer.put(f21875OooOoO);
            }
            byteBuffer.put(f21877OooOoOO);
        } else {
            i = iPosition;
            byteBuffer = byteBuffer4;
            i2 = 22;
        }
        int iOooooOO = this.f21880OooOo0o + ((int) ((af0.OooooOO(byteBuffer3.get(0), byteBuffer3.limit() > 1 ? byteBuffer3.get(1) : (byte) 0) * 48000) / 1000000));
        this.f21880OooOo0o = iOooooOO;
        int i7 = i2;
        ByteBuffer byteBuffer5 = byteBuffer;
        OooO0Oo(byteBuffer5, iOooooOO, this.f21879OooOo0O, i4, false);
        for (int i8 = 0; i8 < i4; i8++) {
            if (i3 >= 255) {
                byteBuffer5.put((byte) -1);
                i3 -= 255;
            } else {
                byteBuffer5.put((byte) i3);
                i3 = 0;
            }
        }
        for (int i9 = i; i9 < iLimit; i9++) {
            byteBuffer5.put(byteBuffer3.get(i9));
        }
        byteBuffer3.position(byteBuffer3.limit());
        byteBuffer5.flip();
        if (this.f21879OooOo0O == 2) {
            byteBuffer5.putInt(length + 66, i80.OooOO0O(byteBuffer5.arrayOffset() + length + 44, byteBuffer5.array(), byteBuffer5.limit() - byteBuffer5.position(), 0));
        } else {
            byteBuffer5.putInt(i7, i80.OooOO0O(byteBuffer5.arrayOffset(), byteBuffer5.array(), byteBuffer5.limit() - byteBuffer5.position(), 0));
        }
        this.f21879OooOo0O++;
        this.f21878OooOo = byteBuffer5;
        c41Var.OooO0Oo();
        c41Var.OooO0o0(((ByteBuffer) this.f21878OooOo).remaining());
        c41Var.f17682OooO0o0.put((ByteBuffer) this.f21878OooOo);
        c41Var.OooO0o();
    }

    public long OooO0o0(o000000 o000000Var, boolean z, boolean z2, int i) throws EOFException, InterruptedIOException {
        int i2;
        int i3 = this.f21879OooOo0O;
        byte[] bArr = (byte[]) this.f21878OooOo;
        if (i3 == 0) {
            if (!o000000Var.OooO0o0(bArr, 0, 1, z)) {
                return -1L;
            }
            int i4 = bArr[0] & ForkServer.ERROR;
            int i5 = 0;
            while (true) {
                if (i5 >= 8) {
                    i2 = -1;
                    break;
                }
                i2 = i5 + 1;
                if ((f21876OooOoO0[i5] & i4) != 0) {
                    break;
                }
                i5 = i2;
            }
            this.f21880OooOo0o = i2;
            if (i2 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f21879OooOo0O = 1;
        }
        int i6 = this.f21880OooOo0o;
        if (i6 > i) {
            this.f21879OooOo0O = 0;
            return -2L;
        }
        if (i6 != 1) {
            o000000Var.OooO0o0(bArr, 1, i6 - 1, false);
        }
        this.f21879OooOo0O = 0;
        return OooO0OO(bArr, this.f21880OooOo0o, z2);
    }

    @Override // com.google.android.gms.internal.ads.o0O0O0o0
    public int zza() {
        return this.f21879OooOo0O;
    }

    @Override // com.google.android.gms.internal.ads.o0O0O0o0
    public int zzb() {
        return this.f21880OooOo0o;
    }

    @Override // com.google.android.gms.internal.ads.o0O0O0o0
    public int zzc() {
        int i = this.f21879OooOo0O;
        return i == -1 ? ((r40) this.f21878OooOo).OooOoO0() : i;
    }

    @Override // com.google.android.gms.internal.ads.im0
    /* renamed from: zza, reason: collision with other method in class */
    public zm0 mo13706zza() {
        return new nt0(null, this.f21879OooOo0O, this.f21880OooOo0o, false, (dx0) this.f21878OooOo);
    }
}

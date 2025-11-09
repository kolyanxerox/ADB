package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: com.google.android.gms.internal.ads.mq */
/* loaded from: classes2.dex */
public final class C1835mq implements InterfaceC1723jp {

    /* renamed from: OooO, reason: collision with root package name */
    public boolean f21321OooO;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public int f21322OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public float f21323OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public float f21324OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public C1759ko f21325OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public C1759ko f21326OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public C1759ko f21327OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public C1759ko f21328OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public C1467cq f21329OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public ByteBuffer f21330OooOO0O;
    public ShortBuffer OooOO0o;

    /* renamed from: OooOOO, reason: collision with root package name */
    public long f21331OooOOO;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public ByteBuffer f21332OooOOO0;

    /* renamed from: OooOOOO, reason: collision with root package name */
    public long f21333OooOOOO;

    /* renamed from: OooOOOo, reason: collision with root package name */
    public boolean f21334OooOOOo;

    @Override // com.google.android.gms.internal.ads.InterfaceC1723jp
    public final void OooO00o(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            C1467cq c1467cq = this.f21329OooOO0;
            c1467cq.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f21331OooOOO += iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i = c1467cq.f18024OooO0O0;
            int i2 = iRemaining2 / i;
            int i3 = i2 * i;
            short[] sArrOooO0o = c1467cq.OooO0o(c1467cq.f18031OooOO0, c1467cq.f18032OooOO0O, i2);
            c1467cq.f18031OooOO0 = sArrOooO0o;
            shortBufferAsShortBuffer.get(sArrOooO0o, c1467cq.f18032OooOO0O * i, (i3 + i3) / 2);
            c1467cq.f18032OooOO0O += i2;
            c1467cq.OooO0o0();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1723jp
    public final C1759ko OooO0O0(C1759ko c1759ko) throws C2277yo {
        if (c1759ko.f20639OooO0OO != 2) {
            throw new C2277yo(c1759ko);
        }
        int i = this.f21322OooO0O0;
        if (i == -1) {
            i = c1759ko.f20637OooO00o;
        }
        this.f21326OooO0o0 = c1759ko;
        C1759ko c1759ko2 = new C1759ko(i, c1759ko.f20638OooO0O0, 2);
        this.f21325OooO0o = c1759ko2;
        this.f21321OooO = true;
        return c1759ko2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1723jp
    public final ByteBuffer zzb() {
        C1467cq c1467cq = this.f21329OooOO0;
        if (c1467cq != null) {
            int i = c1467cq.f18034OooOOO0;
            int i2 = c1467cq.f18024OooO0O0;
            int i3 = i * i2;
            int i4 = i3 + i3;
            if (i4 > 0) {
                if (this.f21330OooOO0O.capacity() < i4) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i4).order(ByteOrder.nativeOrder());
                    this.f21330OooOO0O = byteBufferOrder;
                    this.OooOO0o = byteBufferOrder.asShortBuffer();
                } else {
                    this.f21330OooOO0O.clear();
                    this.OooOO0o.clear();
                }
                ShortBuffer shortBuffer = this.OooOO0o;
                int iMin = Math.min(shortBuffer.remaining() / i2, c1467cq.f18034OooOOO0);
                int i5 = iMin * i2;
                shortBuffer.put(c1467cq.OooOO0o, 0, i5);
                int i6 = c1467cq.f18034OooOOO0 - iMin;
                c1467cq.f18034OooOOO0 = i6;
                short[] sArr = c1467cq.OooOO0o;
                System.arraycopy(sArr, i5, sArr, 0, i6 * i2);
                this.f21333OooOOOO += i4;
                this.f21330OooOO0O.limit(i4);
                this.f21332OooOOO0 = this.f21330OooOO0O;
            }
        }
        ByteBuffer byteBuffer = this.f21332OooOOO0;
        this.f21332OooOOO0 = InterfaceC1723jp.f20345OooO00o;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1723jp
    public final void zzc() {
        if (zzg()) {
            C1759ko c1759ko = this.f21326OooO0o0;
            this.f21327OooO0oO = c1759ko;
            C1759ko c1759ko2 = this.f21325OooO0o;
            this.f21328OooO0oo = c1759ko2;
            if (this.f21321OooO) {
                this.f21329OooOO0 = new C1467cq(c1759ko.f20637OooO00o, c1759ko.f20638OooO0O0, this.f21323OooO0OO, this.f21324OooO0Oo, c1759ko2.f20637OooO00o);
            } else {
                C1467cq c1467cq = this.f21329OooOO0;
                if (c1467cq != null) {
                    c1467cq.f18032OooOO0O = 0;
                    c1467cq.f18034OooOOO0 = 0;
                    c1467cq.f18035OooOOOO = 0;
                    c1467cq.f18036OooOOOo = 0;
                    c1467cq.f18038OooOOo0 = 0;
                    c1467cq.f18037OooOOo = 0;
                    c1467cq.f18039OooOOoo = 0;
                    c1467cq.f18040OooOo00 = 0;
                    c1467cq.OooOo0 = 0;
                    c1467cq.f18041OooOo0O = 0;
                    c1467cq.f18042OooOo0o = 0.0d;
                }
            }
        }
        this.f21332OooOOO0 = InterfaceC1723jp.f20345OooO00o;
        this.f21331OooOOO = 0L;
        this.f21333OooOOOO = 0L;
        this.f21334OooOOOo = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1723jp
    public final void zzd() {
        C1467cq c1467cq = this.f21329OooOO0;
        if (c1467cq != null) {
            int i = c1467cq.f18032OooOO0O;
            int i2 = c1467cq.f18037OooOOo;
            int i3 = c1467cq.f18034OooOOO0;
            float f = c1467cq.f18025OooO0OO;
            float f2 = c1467cq.f18026OooO0Oo;
            int i4 = i3 + ((int) (((((((i - i2) / (f / f2)) + i2) + c1467cq.f18042OooOo0o) + c1467cq.f18035OooOOOO) / (c1467cq.f18028OooO0o0 * f2)) + 0.5d));
            c1467cq.f18042OooOo0o = 0.0d;
            int i5 = c1467cq.f18030OooO0oo;
            int i6 = i5 + i5;
            c1467cq.f18031OooOO0 = c1467cq.OooO0o(c1467cq.f18031OooOO0, i, i6 + i);
            int i7 = 0;
            while (true) {
                int i8 = c1467cq.f18024OooO0O0;
                if (i7 >= i6 * i8) {
                    break;
                }
                c1467cq.f18031OooOO0[(i8 * i) + i7] = 0;
                i7++;
            }
            c1467cq.f18032OooOO0O += i6;
            c1467cq.OooO0o0();
            if (c1467cq.f18034OooOOO0 > i4) {
                c1467cq.f18034OooOOO0 = i4;
            }
            c1467cq.f18032OooOO0O = 0;
            c1467cq.f18037OooOOo = 0;
            c1467cq.f18035OooOOOO = 0;
        }
        this.f21334OooOOOo = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1723jp
    public final void zzf() {
        this.f21323OooO0OO = 1.0f;
        this.f21324OooO0Oo = 1.0f;
        C1759ko c1759ko = C1759ko.f20636OooO0o0;
        this.f21326OooO0o0 = c1759ko;
        this.f21325OooO0o = c1759ko;
        this.f21327OooO0oO = c1759ko;
        this.f21328OooO0oo = c1759ko;
        ByteBuffer byteBuffer = InterfaceC1723jp.f20345OooO00o;
        this.f21330OooOO0O = byteBuffer;
        this.OooOO0o = byteBuffer.asShortBuffer();
        this.f21332OooOOO0 = byteBuffer;
        this.f21322OooO0O0 = -1;
        this.f21321OooO = false;
        this.f21329OooOO0 = null;
        this.f21331OooOOO = 0L;
        this.f21333OooOOOO = 0L;
        this.f21334OooOOOo = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1723jp
    public final boolean zzg() {
        if (this.f21325OooO0o.f20637OooO00o != -1) {
            return Math.abs(this.f21323OooO0OO + (-1.0f)) >= 1.0E-4f || Math.abs(this.f21324OooO0Oo + (-1.0f)) >= 1.0E-4f || this.f21325OooO0o.f20637OooO00o != this.f21326OooO0o0.f20637OooO00o;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1723jp
    public final boolean zzh() {
        if (!this.f21334OooOOOo) {
            return false;
        }
        C1467cq c1467cq = this.f21329OooOO0;
        if (c1467cq == null) {
            return true;
        }
        int i = c1467cq.f18034OooOOO0 * c1467cq.f18024OooO0O0;
        return i + i == 0;
    }
}

package o00OOOoO;

import kotlin.jvm.internal.OooOo;
import o00O0.OooOOO;

/* loaded from: classes3.dex */
public final class o000O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f32563OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public int f32564OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public int f32565OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f32566OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public o000O f32567OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f32568OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public o000O f32569OooO0oO;

    public o000O() {
        this.f32563OooO00o = new byte[8192];
        this.f32568OooO0o0 = true;
        this.f32566OooO0Oo = false;
    }

    public final o000O OooO00o() {
        o000O o000o = this.f32567OooO0o;
        if (o000o == this) {
            o000o = null;
        }
        o000O o000o2 = this.f32569OooO0oO;
        OooOo.OooO0O0(o000o2);
        o000o2.f32567OooO0o = this.f32567OooO0o;
        o000O o000o3 = this.f32567OooO0o;
        OooOo.OooO0O0(o000o3);
        o000o3.f32569OooO0oO = this.f32569OooO0oO;
        this.f32567OooO0o = null;
        this.f32569OooO0oO = null;
        return o000o;
    }

    public final void OooO0O0(o000O segment) {
        OooOo.OooO0o0(segment, "segment");
        segment.f32569OooO0oO = this;
        segment.f32567OooO0o = this.f32567OooO0o;
        o000O o000o = this.f32567OooO0o;
        OooOo.OooO0O0(o000o);
        o000o.f32569OooO0oO = segment;
        this.f32567OooO0o = segment;
    }

    public final o000O OooO0OO() {
        this.f32566OooO0Oo = true;
        return new o000O(this.f32563OooO00o, this.f32564OooO0O0, this.f32565OooO0OO, true);
    }

    public final void OooO0Oo(o000O sink, int i) {
        OooOo.OooO0o0(sink, "sink");
        if (!sink.f32568OooO0o0) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = sink.f32565OooO0OO;
        int i3 = i2 + i;
        byte[] bArr = sink.f32563OooO00o;
        if (i3 > 8192) {
            if (sink.f32566OooO0Oo) {
                throw new IllegalArgumentException();
            }
            int i4 = sink.f32564OooO0O0;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            OooOOO.Oooo0O0(bArr, 0, bArr, i4, i2);
            sink.f32565OooO0OO -= sink.f32564OooO0O0;
            sink.f32564OooO0O0 = 0;
        }
        int i5 = sink.f32565OooO0OO;
        int i6 = this.f32564OooO0O0;
        OooOOO.Oooo0O0(this.f32563OooO00o, i5, bArr, i6, i6 + i);
        sink.f32565OooO0OO += i;
        this.f32564OooO0O0 += i;
    }

    public o000O(byte[] data, int i, int i2, boolean z) {
        OooOo.OooO0o0(data, "data");
        this.f32563OooO00o = data;
        this.f32564OooO0O0 = i;
        this.f32565OooO0OO = i2;
        this.f32566OooO0Oo = z;
        this.f32568OooO0o0 = false;
    }
}

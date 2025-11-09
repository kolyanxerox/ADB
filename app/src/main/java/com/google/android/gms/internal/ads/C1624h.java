package com.google.android.gms.internal.ads;

import com.ironsource.C3034d9;
import java.nio.ByteBuffer;
import java.util.Date;
import org.apache.tika.fork.ForkServer;

/* renamed from: com.google.android.gms.internal.ads.h */
/* loaded from: classes2.dex */
public final class C1624h extends g31 {

    /* renamed from: OooOooO, reason: collision with root package name */
    public int f19487OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public Date f19488OooOooo;

    /* renamed from: Oooo0, reason: collision with root package name */
    public double f19489Oooo0;

    /* renamed from: Oooo000, reason: collision with root package name */
    public Date f19490Oooo000;

    /* renamed from: Oooo00O, reason: collision with root package name */
    public long f19491Oooo00O;

    /* renamed from: Oooo00o, reason: collision with root package name */
    public long f19492Oooo00o;

    /* renamed from: Oooo0O0, reason: collision with root package name */
    public float f19493Oooo0O0;

    /* renamed from: Oooo0OO, reason: collision with root package name */
    public m31 f19494Oooo0OO;

    /* renamed from: Oooo0o0, reason: collision with root package name */
    public long f19495Oooo0o0;

    @Override // com.google.android.gms.internal.ads.g31
    public final void OooO0OO(ByteBuffer byteBuffer) {
        int i = byteBuffer.get();
        if (i < 0) {
            i += 256;
        }
        this.f19487OooOooO = i;
        byteBuffer.get();
        byteBuffer.get();
        byteBuffer.get();
        if (!this.f19212OooOo0o) {
            OooO0Oo();
        }
        if (this.f19487OooOooO == 1) {
            this.f19488OooOooo = xh0.OooOOo(ze0.OoooO0(byteBuffer));
            this.f19490Oooo000 = xh0.OooOOo(ze0.OoooO0(byteBuffer));
            this.f19491Oooo00O = ze0.Oooo0oo(byteBuffer);
            this.f19492Oooo00o = ze0.OoooO0(byteBuffer);
        } else {
            this.f19488OooOooo = xh0.OooOOo(ze0.Oooo0oo(byteBuffer));
            this.f19490Oooo000 = xh0.OooOOo(ze0.Oooo0oo(byteBuffer));
            this.f19491Oooo00O = ze0.Oooo0oo(byteBuffer);
            this.f19492Oooo00o = ze0.Oooo0oo(byteBuffer);
        }
        this.f19489Oooo0 = ze0.OooOOoo(byteBuffer);
        byteBuffer.get(new byte[2]);
        this.f19493Oooo0O0 = ((short) ((r1[1] & ForkServer.ERROR) | ((short) (65280 & (r1[0] << 8))))) / 256.0f;
        byteBuffer.get();
        byteBuffer.get();
        ze0.Oooo0oo(byteBuffer);
        ze0.Oooo0oo(byteBuffer);
        this.f19494Oooo0OO = new m31(ze0.OooOOoo(byteBuffer), ze0.OooOOoo(byteBuffer), ze0.OooOOoo(byteBuffer), ze0.OooOOoo(byteBuffer), ze0.OooO00o(byteBuffer), ze0.OooO00o(byteBuffer), ze0.OooO00o(byteBuffer), ze0.OooOOoo(byteBuffer), ze0.OooOOoo(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.f19495Oooo0o0 = ze0.Oooo0oo(byteBuffer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MovieHeaderBox[creationTime=");
        sb.append(this.f19488OooOooo);
        sb.append(";modificationTime=");
        sb.append(this.f19490Oooo000);
        sb.append(";timescale=");
        sb.append(this.f19491Oooo00O);
        sb.append(";duration=");
        sb.append(this.f19492Oooo00o);
        sb.append(";rate=");
        sb.append(this.f19489Oooo0);
        sb.append(";volume=");
        sb.append(this.f19493Oooo0O0);
        sb.append(";matrix=");
        sb.append(this.f19494Oooo0OO);
        sb.append(";nextTrackId=");
        return OooO0oO.OooOo.OooOOOO(sb, this.f19495Oooo0o0, C3034d9.i.f8179e);
    }
}

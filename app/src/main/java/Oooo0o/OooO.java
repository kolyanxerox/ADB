package Oooo0o;

import OooO0oO.OooOo;
import OooOooo.o000O;
import Oooo00O.o000000O;
import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.google.android.gms.internal.ads.AbstractC2200wl;
import com.google.android.gms.internal.ads.C1548ey;
import com.google.android.gms.internal.ads.C1847n1;
import com.google.android.gms.internal.ads.C2249xx;
import com.google.android.gms.internal.ads.C2274yl;
import com.google.android.gms.internal.ads.InterfaceC1390am;
import com.google.android.gms.internal.ads.InterfaceC1427bm;
import com.google.android.gms.internal.ads.et0;
import com.google.android.gms.internal.ads.ii0;
import com.google.android.gms.internal.ads.wp0;
import com.google.android.gms.internal.ads.xh0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.AEADBadTagException;
import o000O00.o00O0O0O;

/* loaded from: classes2.dex */
public abstract class OooO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Object f13856OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public Object f13857OooO0O0;

    public OooO(C1548ey c1548ey, zzj zzjVar) {
        this.f13857OooO0O0 = c1548ey;
        this.f13856OooO00o = zzjVar;
    }

    public static byte[] OooO0o0(ByteBuffer byteBuffer, byte[] bArr) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining % 16;
        int i2 = (i == 0 ? iRemaining : (iRemaining + 16) - i) + length;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(bArr);
        byteBufferOrder.position(length);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(i2);
        byteBufferOrder.putLong(bArr.length);
        byteBufferOrder.putLong(iRemaining);
        return byteBufferOrder.array();
    }

    public void OooO() {
        ((C2274yl) this.f13856OooO00o).zzd(new Exception());
    }

    public byte[] OooO00o(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int iPosition = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr4 = new byte[32];
            ((et0) this.f13857OooO0O0).OooO00o(0, bArr).get(bArr4);
            if (!MessageDigest.isEqual(o00O0O0O.OooO0OO(bArr4, OooO0o0(byteBuffer, bArr2)), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(iPosition);
            et0 et0Var = (et0) this.f13856OooO00o;
            et0Var.getClass();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
            et0Var.OooO0Oo(bArr, byteBufferAllocate, byteBuffer);
            return byteBufferAllocate.array();
        } catch (GeneralSecurityException e) {
            throw new AEADBadTagException(e.toString());
        }
    }

    public void OooO0O0(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (byteBuffer.remaining() < bArr2.length + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int iPosition = byteBuffer.position();
        et0 et0Var = (et0) this.f13856OooO00o;
        et0Var.getClass();
        if (byteBuffer.remaining() < bArr2.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        et0Var.OooO0Oo(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr3 == null) {
            bArr3 = new byte[0];
        }
        byte[] bArr4 = new byte[32];
        ((et0) this.f13857OooO0O0).OooO00o(0, bArr).get(bArr4);
        byte[] bArrOooO0OO = o00O0O0O.OooO0OO(bArr4, OooO0o0(byteBuffer, bArr3));
        byteBuffer.limit(byteBuffer.limit() + 16);
        byteBuffer.put(bArrOooO0OO);
    }

    public abstract Object OooO0OO(IBinder iBinder);

    public Object OooO0Oo(Context context) throws OooO0o {
        if (this.f13857OooO0O0 == null) {
            o000000O.OooO0oo(context);
            Context contextOooO00o = o000O.OooO00o(context);
            if (contextOooO00o == null) {
                throw new OooO0o("Could not get remote context.");
            }
            try {
                this.f13857OooO0O0 = OooO0OO((IBinder) contextOooO00o.getClassLoader().loadClass((String) this.f13856OooO00o).newInstance());
            } catch (ClassNotFoundException e) {
                throw new OooO0o("Could not load creator class.", e);
            } catch (IllegalAccessException e2) {
                throw new OooO0o("Could not access creator.", e2);
            } catch (InstantiationException e3) {
                throw new OooO0o("Could not instantiate creator.", e3);
            }
        }
        return this.f13857OooO0O0;
    }

    public abstract et0 OooO0o(int i, byte[] bArr);

    public abstract et0 OooO0oO(int i, byte[] bArr);

    public byte[] OooO0oo(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int iPosition = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr4 = new byte[32];
            ((et0) this.f13857OooO0O0).OooO0oO(0, bArr).get(bArr4);
            int length = bArr2.length;
            int i = length & 15;
            int i2 = i == 0 ? length : (length + 16) - i;
            int iRemaining = byteBuffer.remaining();
            int i3 = iRemaining % 16;
            int i4 = (i3 == 0 ? iRemaining : (iRemaining + 16) - i3) + i2;
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(i4 + 16).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put(bArr2);
            byteBufferOrder.position(i2);
            byteBufferOrder.put(byteBuffer);
            byteBufferOrder.position(i4);
            byteBufferOrder.putLong(length);
            byteBufferOrder.putLong(iRemaining);
            if (!MessageDigest.isEqual(ii0.OooOo0(bArr4, byteBufferOrder.array()), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(iPosition);
            et0 et0Var = (et0) this.f13856OooO00o;
            et0Var.getClass();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
            if (bArr.length != et0Var.OooO0o0()) {
                throw new GeneralSecurityException(OooOo.OooO0o(et0Var.OooO0o0(), "The nonce length (in bytes) must be "));
            }
            int iRemaining2 = byteBuffer.remaining();
            int i5 = iRemaining2 / 64;
            for (int i6 = 0; i6 < i5 + 1; i6++) {
                ByteBuffer byteBufferOooO0oO = et0Var.OooO0oO(et0Var.f18698OooO0O0 + i6, bArr);
                if (i6 == i5) {
                    ii0.OooOOOO(byteBufferAllocate, byteBuffer, byteBufferOooO0oO, iRemaining2 % 64);
                } else {
                    ii0.OooOOOO(byteBufferAllocate, byteBuffer, byteBufferOooO0oO, 64);
                }
            }
            return byteBufferAllocate.array();
        } catch (GeneralSecurityException e) {
            throw new AEADBadTagException(e.toString());
        }
    }

    public void OooOO0(String str, Throwable th) {
        ((C2274yl) this.f13856OooO00o).zzd(th);
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0O0o0OO)).booleanValue()) {
            zzv.zzp().OooO0oO(str, th);
        }
    }

    public void OooOO0O(InterfaceC1427bm interfaceC1427bm, InterfaceC1390am interfaceC1390am) {
        C2249xx c2249xx = new C2249xx(21, interfaceC1427bm, interfaceC1390am);
        C2274yl c2274yl = (C2274yl) this.f13856OooO00o;
        c2274yl.addListener(new wp0(0, c2274yl, c2249xx), AbstractC2200wl.f25327OooO0oO);
    }

    public OooO(String str) {
        this.f13856OooO00o = str;
    }

    public OooO() {
        C2274yl c2274yl = new C2274yl();
        this.f13856OooO00o = c2274yl;
        this.f13857OooO0O0 = new AtomicInteger(0);
        C1847n1 c1847n1 = new C1847n1(this, 10);
        c2274yl.addListener(new wp0(0, c2274yl, c1847n1), AbstractC2200wl.f25327OooO0oO);
    }

    public OooO(byte[] bArr, int i) throws GeneralSecurityException {
        switch (i) {
            case 4:
                if (AbstractC2183w4.OooO00o(1)) {
                    this.f13856OooO00o = OooO0o(1, bArr);
                    this.f13857OooO0O0 = OooO0o(0, bArr);
                    return;
                }
                throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
            default:
                if (xh0.OooOo0O(1)) {
                    this.f13856OooO00o = OooO0oO(1, bArr);
                    this.f13857OooO0O0 = OooO0oO(0, bArr);
                    return;
                }
                throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
    }
}

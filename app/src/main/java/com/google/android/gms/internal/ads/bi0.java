package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.io.EOFException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes2.dex */
public final class bi0 implements ua1 {

    /* renamed from: OooOo */
    public Object f17507OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f17508OooOo0O;

    /* renamed from: OooOo0o */
    public Object f17509OooOo0o;

    /* renamed from: OooOoO0 */
    public Object f17510OooOoO0;

    public /* synthetic */ bi0(int i, boolean z) {
        this.f17508OooOo0O = i;
        this.f17509OooOo0o = null;
        this.f17507OooOo = null;
        this.f17510OooOoO0 = null;
    }

    public static final bi0 OooO0Oo(yq0 yq0Var) {
        int i;
        int i2;
        int i3;
        com.google.android.gms.internal.measurement.o0OOO00 o0ooo00 = new com.google.android.gms.internal.measurement.o0OOO00(6);
        uq0 uq0Var = new uq0(yq0Var);
        o0O o0o = o0O.f21860OooOooo;
        uq0Var.f24764OooO0OO = o0o;
        char c = 1;
        uq0Var.f24762OooO00o = true;
        ArrayList arrayList = (ArrayList) o0ooo00.f26564OooOo0o;
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            ((uq0) obj).f24762OooO00o = false;
        }
        arrayList.add(uq0Var);
        if (o0ooo00.f26563OooOo0O) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        o0ooo00.f26563OooOo0O = true;
        ox0 ox0VarOooOoO0 = rx0.OooOoO0();
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int i6 = 0;
        while (i6 < arrayList.size() - 1) {
            int i7 = i6 + 1;
            if (((uq0) arrayList.get(i6)).f24764OooO0OO == o0o && ((uq0) arrayList.get(i7)).f24764OooO0OO != o0o) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
            i6 = i7;
        }
        HashSet hashSet = new HashSet();
        int size2 = arrayList.size();
        int i8 = 0;
        Integer num = null;
        while (i8 < size2) {
            Object obj2 = arrayList.get(i8);
            i8++;
            uq0 uq0Var2 = (uq0) obj2;
            uq0Var2.getClass();
            o0O o0o2 = uq0Var2.f24764OooO0OO;
            if (o0o2 == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            int i9 = 4;
            if (o0o2 == o0o) {
                i2 = i4;
                while (true) {
                    i = i4;
                    if (i2 != 0 && !hashSet.contains(Integer.valueOf(i2))) {
                        break;
                    }
                    SecureRandom secureRandom = new SecureRandom();
                    byte[] bArr = new byte[i9];
                    int i10 = i;
                    while (i10 == 0) {
                        secureRandom.nextBytes(bArr);
                        i10 = ((bArr[i] & ForkServer.ERROR) << 24) | ((bArr[c] & ForkServer.ERROR) << 16) | ((bArr[2] & ForkServer.ERROR) << 8) | (bArr[3] & ForkServer.ERROR);
                        c = 1;
                        i9 = 4;
                    }
                    i4 = i;
                    i2 = i10;
                }
            } else {
                i = i4;
                i2 = i;
            }
            Integer numValueOf = Integer.valueOf(i2);
            if (hashSet.contains(numValueOf)) {
                throw new GeneralSecurityException(OooO0oO.OooOo.OooO0oO(i2, "Id ", " is used twice in the keyset"));
            }
            hashSet.add(numValueOf);
            yq0 yq0Var2 = uq0Var2.f24763OooO0O0;
            ii0 ii0VarOooO00o = zt0.f26384OooO0O0.OooO00o(yq0Var2, true != yq0Var2.OooO00o() ? null : numValueOf);
            Object obj3 = tq0.f24467OooOo;
            vq0 vq0Var = new vq0(ii0VarOooO00o);
            su0 su0Var = (su0) fu0.f19127OooO0O0.OooO0OO(ii0VarOooO00o);
            Integer num2 = su0Var.f24167OooO0o;
            if (num2 != null && num2.intValue() != i2) {
                throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
            }
            if (obj3.equals(obj3)) {
                i3 = 3;
            } else if (tq0.f24469OooOoO0.equals(obj3)) {
                i3 = 4;
            } else {
                if (!tq0.f24468OooOoO.equals(obj3)) {
                    throw new IllegalStateException("Unknown key status");
                }
                i3 = 5;
            }
            px0 px0VarOooOoO0 = qx0.OooOoO0();
            o0O o0o3 = o0o;
            jx0 jx0VarOooOo0o = kx0.OooOo0o();
            jx0VarOooOo0o.OooO0Oo();
            ArrayList arrayList3 = arrayList;
            kx0.OooOoo((kx0) jx0VarOooOo0o.f25822OooOo0o, su0Var.f24163OooO00o);
            jx0VarOooOo0o.OooO0Oo();
            kx0.OooOooO((kx0) jx0VarOooOo0o.f25822OooOo0o, su0Var.f24165OooO0OO);
            jx0VarOooOo0o.OooO0Oo();
            kx0.OooOoo0((kx0) jx0VarOooOo0o.f25822OooOo0o, su0Var.f24166OooO0Oo);
            px0VarOooOoO0.OooO0Oo();
            qx0.OooOoOO((qx0) px0VarOooOoO0.f25822OooOo0o, (kx0) jx0VarOooOo0o.OooO0O0());
            px0VarOooOoO0.OooO0Oo();
            qx0.Oooo000((qx0) px0VarOooOoO0.f25822OooOo0o, i3);
            px0VarOooOoO0.OooO0Oo();
            ((qx0) px0VarOooOoO0.f25822OooOo0o).zzf = i2;
            px0VarOooOoO0.OooO0Oo();
            ((qx0) px0VarOooOoO0.f25822OooOo0o).zzg = su0Var.f24168OooO0o0.OooO00o();
            qx0 qx0Var = (qx0) px0VarOooOoO0.OooO0O0();
            ox0VarOooOoO0.OooO0Oo();
            rx0.OooOoo((rx0) ox0VarOooOoO0.f25822OooOo0o, qx0Var);
            if (uq0Var2.f24762OooO00o) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                num = numValueOf;
            }
            arrayList2.add(vq0Var);
            i4 = i;
            o0o = o0o3;
            arrayList = arrayList3;
            c = 1;
        }
        if (num == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        int iIntValue = num.intValue();
        ox0VarOooOoO0.OooO0Oo();
        ((rx0) ox0VarOooOoO0.f25822OooOo0o).zzc = iIntValue;
        rx0 rx0Var = (rx0) ox0VarOooOoO0.OooO0O0();
        if (rx0Var.OooOo0o() > 0) {
            return new bi0(rx0Var, arrayList2, (wt0) o0ooo00.f26562OooOo, 2);
        }
        throw new GeneralSecurityException("empty keyset");
    }

    public vr0 OooO() throws GeneralSecurityException {
        pd0 pd0Var;
        az0 az0VarOooO0O0;
        xr0 xr0Var = (xr0) this.f17509OooOo0o;
        if (xr0Var == null || (pd0Var = (pd0) this.f17507OooOo) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (xr0Var.f25788OooO00o != ((az0) pd0Var.f23325OooOo0o).f17140OooO00o.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (xr0Var.OooO00o() && ((Integer) this.f17510OooOoO0) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((xr0) this.f17509OooOo0o).OooO00o() && ((Integer) this.f17510OooOoO0) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        tq0 tq0Var = ((xr0) this.f17509OooOo0o).f25789OooO0O0;
        if (tq0Var == tq0.f24471OooOoo) {
            az0VarOooO0O0 = gu0.f19473OooO00o;
        } else if (tq0Var == tq0.f24472OooOoo0) {
            az0VarOooO0O0 = gu0.OooO00o(((Integer) this.f17510OooOoO0).intValue());
        } else {
            if (tq0Var != tq0.f24470OooOoOO) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(((xr0) this.f17509OooOo0o).f25789OooO0O0)));
            }
            az0VarOooO0O0 = gu0.OooO0O0(((Integer) this.f17510OooOoO0).intValue());
        }
        return new vr0((xr0) this.f17509OooOo0o, (pd0) this.f17507OooOo, az0VarOooO0O0, (Integer) this.f17510OooOoO0);
    }

    public void OooO00o(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
        this.f17509OooOo0o = Integer.valueOf(i);
    }

    public void OooO0O0(AudioTrack audioTrack) {
        Handler handler = (Handler) this.f17509OooOo0o;
        Objects.requireNonNull(handler);
        audioTrack.registerStreamEventCallback(new oOO0Oo00(1, handler), (g71) this.f17507OooOo);
    }

    public long OooO0OO() {
        o000000 o000000Var = (o000000) this.f17510OooOoO0;
        if (o000000Var != null) {
            return o000000Var.f21650OooOoO0;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.ua1
    public gn0 OooO0o(int i, C1421bg c1421bg, int[] iArr) {
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Point point;
        C1421bg c1421bg2 = c1421bg;
        int i7 = ((int[]) this.f17510OooOoO0)[i];
        qa1 qa1Var = (qa1) this.f17509OooOo0o;
        int i8 = qa1Var.f19362OooO00o;
        if (i8 != Integer.MAX_VALUE) {
            int i9 = qa1Var.f19363OooO0O0;
            if (i9 == Integer.MAX_VALUE) {
                i2 = Integer.MAX_VALUE;
                z = true;
            } else {
                int i10 = Integer.MAX_VALUE;
                for (int i11 = 0; i11 < c1421bg2.f17492OooO00o; i11++) {
                    o0OoOo0 o0oooo0 = c1421bg2.f17495OooO0Oo[i11];
                    int i12 = o0oooo0.f22229OooOo00;
                    if (i12 > 0 && (i4 = o0oooo0.OooOo0) > 0) {
                        if ((i12 > i4) != (i8 > i9)) {
                            i6 = i8;
                            i5 = i9;
                        } else {
                            i5 = i8;
                            i6 = i9;
                        }
                        if (i12 * i6 >= i4 * i5) {
                            int i13 = i80.f19994OooO00o;
                            point = new Point(i5, ((r11 + i12) - 1) / i12);
                        } else {
                            int i14 = i80.f19994OooO00o;
                            point = new Point(((r10 + i4) - 1) / i4, i6);
                        }
                        int i15 = o0oooo0.f22229OooOo00;
                        int i16 = i15 * i4;
                        if (i15 >= ((int) (point.x * 0.98f)) && i4 >= ((int) (point.y * 0.98f)) && i16 < i10) {
                            i10 = i16;
                        }
                    }
                }
                z = true;
                i2 = i10;
            }
        } else {
            z = true;
            i2 = Integer.MAX_VALUE;
        }
        xh0.OooOOoo(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i17 = 0;
        int i18 = 0;
        while (i17 < c1421bg2.f17492OooO00o) {
            o0OoOo0 o0oooo02 = c1421bg2.f17495OooO0Oo[i17];
            int i19 = o0oooo02.f22229OooOo00;
            int i20 = (i19 == -1 || (i3 = o0oooo02.OooOo0) == -1) ? -1 : i19 * i3;
            wa1 wa1Var = new wa1(i, c1421bg2, i17, qa1Var, iArr[i17], (String) this.f17507OooOo, (i2 == Integer.MAX_VALUE || (i20 != -1 && i20 <= i2)) ? z : false);
            int length = objArrCopyOf.length;
            int i21 = i18 + 1;
            int iOooO0o = lm0.OooO0o(length, i21);
            if (iOooO0o > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iOooO0o);
            }
            objArrCopyOf[i18] = wa1Var;
            i17++;
            i18 = i21;
            c1421bg2 = c1421bg;
        }
        return rm0.OooOOO(i18, objArrCopyOf);
    }

    public void OooO0o0(int i) throws GeneralSecurityException {
        if (i < 10 || i > 16) {
            throw new GeneralSecurityException(OooO0oO.OooOo.OooO0o(i, "Invalid tag size for AesCmacParameters: "));
        }
        this.f17507OooOo = Integer.valueOf(i);
    }

    public void OooO0oO(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback((g71) this.f17507OooOo);
        ((Handler) this.f17509OooOo0o).removeCallbacksAndMessages(null);
    }

    public rr0 OooO0oo() throws GeneralSecurityException {
        pd0 pd0Var;
        az0 az0VarOooO0O0;
        ur0 ur0Var = (ur0) this.f17509OooOo0o;
        if (ur0Var == null || (pd0Var = (pd0) this.f17507OooOo) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (ur0Var.f24772OooO00o != ((az0) pd0Var.f23325OooOo0o).f17140OooO00o.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (ur0Var.OooO00o() && ((Integer) this.f17510OooOoO0) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((ur0) this.f17509OooOo0o).OooO00o() && ((Integer) this.f17510OooOoO0) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        tr0 tr0Var = ((ur0) this.f17509OooOo0o).f24774OooO0OO;
        if (tr0Var == tr0.f24488OooOoO) {
            az0VarOooO0O0 = gu0.f19473OooO00o;
        } else if (tr0Var == tr0.f24489OooOoO0) {
            az0VarOooO0O0 = gu0.OooO00o(((Integer) this.f17510OooOoO0).intValue());
        } else {
            if (tr0Var != tr0.f24487OooOo) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(((ur0) this.f17509OooOo0o).f24774OooO0OO)));
            }
            az0VarOooO0O0 = gu0.OooO0O0(((Integer) this.f17510OooOoO0).intValue());
        }
        return new rr0((ur0) this.f17509OooOo0o, (pd0) this.f17507OooOo, az0VarOooO0O0, (Integer) this.f17510OooOoO0);
    }

    public yr0 OooOO0() throws GeneralSecurityException {
        pd0 pd0Var;
        az0 az0VarOooO0O0;
        as0 as0Var = (as0) this.f17509OooOo0o;
        if (as0Var == null || (pd0Var = (pd0) this.f17507OooOo) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (as0Var.f17096OooO00o != ((az0) pd0Var.f23325OooOo0o).f17140OooO00o.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (as0Var.OooO00o() && ((Integer) this.f17510OooOoO0) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((as0) this.f17509OooOo0o).OooO00o() && ((Integer) this.f17510OooOoO0) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        or0 or0Var = ((as0) this.f17509OooOo0o).f17097OooO0O0;
        if (or0Var == or0.f23093OooOooo) {
            az0VarOooO0O0 = gu0.f19473OooO00o;
        } else if (or0Var == or0.f23092OooOooO) {
            az0VarOooO0O0 = gu0.OooO00o(((Integer) this.f17510OooOoO0).intValue());
        } else {
            if (or0Var != or0.f23090OooOoo) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(((as0) this.f17509OooOo0o).f17097OooO0O0)));
            }
            az0VarOooO0O0 = gu0.OooO0O0(((Integer) this.f17510OooOoO0).intValue());
        }
        return new yr0((as0) this.f17509OooOo0o, (pd0) this.f17507OooOo, az0VarOooO0O0, (Integer) this.f17510OooOoO0);
    }

    public av0 OooOO0O() throws GeneralSecurityException {
        pd0 pd0Var;
        az0 az0VarOooO00o;
        dv0 dv0Var = (dv0) this.f17509OooOo0o;
        if (dv0Var == null || (pd0Var = (pd0) this.f17507OooOo) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (dv0Var.f18412OooO00o != ((az0) pd0Var.f23325OooOo0o).f17140OooO00o.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (dv0Var.OooO00o() && ((Integer) this.f17510OooOoO0) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((dv0) this.f17509OooOo0o).OooO00o() && ((Integer) this.f17510OooOoO0) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        tq0 tq0Var = ((dv0) this.f17509OooOo0o).f18414OooO0OO;
        if (tq0Var == tq0.f24481Oooo0o) {
            az0VarOooO00o = gu0.f19473OooO00o;
        } else if (tq0Var == tq0.f24482Oooo0o0 || tq0Var == tq0.f24480Oooo0OO) {
            az0VarOooO00o = gu0.OooO00o(((Integer) this.f17510OooOoO0).intValue());
        } else {
            if (tq0Var != tq0.f24479Oooo0O0) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(((dv0) this.f17509OooOo0o).f18414OooO0OO)));
            }
            az0VarOooO00o = gu0.OooO0O0(((Integer) this.f17510OooOoO0).intValue());
        }
        return new av0((dv0) this.f17509OooOo0o, (pd0) this.f17507OooOo, az0VarOooO00o, (Integer) this.f17510OooOoO0);
    }

    public dv0 OooOO0o() throws GeneralSecurityException {
        Integer num = (Integer) this.f17509OooOo0o;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (((Integer) this.f17507OooOo) != null) {
            return new dv0(num.intValue(), ((Integer) this.f17507OooOo).intValue(), (tq0) this.f17510OooOoO0);
        }
        throw new GeneralSecurityException("tag size not set");
    }

    public Object OooOOO() throws GeneralSecurityException {
        Class clsOooO00o;
        int i = br0.f17590OooO00o;
        try {
            clsOooO00o = eu0.f18703OooO0O0.OooO00o();
        } catch (GeneralSecurityException unused) {
            clsOooO00o = null;
        }
        if (clsOooO00o == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(pq0.class.getName()));
        }
        int i2 = dr0.f18395OooO00o;
        rx0 rx0Var = (rx0) this.f17509OooOo0o;
        int iOooOo = rx0Var.OooOo();
        boolean z = true;
        int i3 = 0;
        boolean z2 = false;
        for (qx0 qx0Var : rx0Var.OooOoo0()) {
            if (qx0Var.OooOooo() == 3) {
                if (!qx0Var.OooOooO()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(qx0Var.OooOo0o())));
                }
                if (qx0Var.OooOoO() == fy0.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(qx0Var.OooOo0o())));
                }
                if (qx0Var.OooOooo() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(qx0Var.OooOo0o())));
                }
                if (qx0Var.OooOo0o() == iOooOo) {
                    if (z2) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z2 = true;
                }
                z &= qx0Var.OooOo().OooOo() == 4;
                i3++;
            }
        }
        if (i3 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z2 && !z) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        OooOOo0.o0OOO0o o0ooo0o = new OooOOo0.o0OOO0o(clsOooO00o, 12);
        if (((HashMap) o0ooo0o.f13516OooOo) == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build");
        }
        o0ooo0o.f13521OooOoOO = (wt0) this.f17510OooOoO0;
        int i4 = 0;
        while (true) {
            List list = (List) this.f17507OooOo;
            if (i4 >= list.size()) {
                HashMap map = (HashMap) o0ooo0o.f13516OooOo;
                if (map == null) {
                    throw new IllegalStateException("build cannot be called twice");
                }
                qu0 qu0Var = (qu0) o0ooo0o.f13519OooOoO;
                wt0 wt0Var = (wt0) o0ooo0o.f13521OooOoOO;
                Class cls = (Class) o0ooo0o.f13518OooOo0o;
                bi0 bi0Var = new bi0(map, qu0Var, wt0Var, cls);
                o0ooo0o.f13516OooOo = null;
                int i5 = br0.f17590OooO00o;
                HashMap map2 = ((pu0) eu0.f18703OooO0O0.f18704OooO00o.get()).f23429OooO0O0;
                if (!map2.containsKey(pq0.class)) {
                    throw new GeneralSecurityException("No wrapper found for ".concat(pq0.class.toString()));
                }
                ru0 ru0Var = (ru0) map2.get(pq0.class);
                if (cls.equals(ru0Var.zza()) && ru0Var.zza().equals(cls)) {
                    return ru0Var.OooO00o(bi0Var);
                }
                throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
            }
            qx0 qx0VarOooOoO = rx0Var.OooOoO(i4);
            if (qx0VarOooOoO.OooOooo() == 3) {
                vq0 vq0Var = (vq0) list.get(i4);
                if (vq0Var == null) {
                    throw new GeneralSecurityException("Key parsing of key with index " + i4 + " and type_url " + qx0VarOooOoO.OooOo().OooOoOO() + " failed, unable to get primitive");
                }
                try {
                    Object objOooO0O0 = eu0.f18703OooO0O0.OooO0O0(vq0Var.f25111OooO00o, clsOooO00o);
                    if (qx0VarOooOoO.OooOo0o() == rx0Var.OooOo()) {
                        o0ooo0o.OooOoO(objOooO0O0, qx0VarOooOoO, true);
                    } else {
                        o0ooo0o.OooOoO(objOooO0O0, qx0VarOooOoO, false);
                    }
                } catch (GeneralSecurityException e) {
                    throw new GeneralSecurityException(OooO0oO.OooOo.OooOO0o("Unable to get primitive ", clsOooO00o.toString(), " for key of type ", qx0VarOooOoO.OooOo().OooOoOO(), ", see https://developers.google.com/tink/faq/registration_errors"), e);
                }
            }
            i4++;
        }
    }

    public fv0 OooOOO0() throws GeneralSecurityException {
        pd0 pd0Var;
        az0 az0VarOooO00o;
        jv0 jv0Var = (jv0) this.f17509OooOo0o;
        if (jv0Var == null || (pd0Var = (pd0) this.f17507OooOo) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (jv0Var.f20395OooO00o != ((az0) pd0Var.f23325OooOo0o).f17140OooO00o.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (jv0Var.OooO00o() && ((Integer) this.f17510OooOoO0) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((jv0) this.f17509OooOo0o).OooO00o() && ((Integer) this.f17510OooOoO0) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        iv0 iv0Var = ((jv0) this.f17509OooOo0o).f20397OooO0OO;
        if (iv0Var == iv0.f20123OooO0o0) {
            az0VarOooO00o = gu0.f19473OooO00o;
        } else if (iv0Var == iv0.f20122OooO0Oo || iv0Var == iv0.f20121OooO0OO) {
            az0VarOooO00o = gu0.OooO00o(((Integer) this.f17510OooOoO0).intValue());
        } else {
            if (iv0Var != iv0.f20120OooO0O0) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(((jv0) this.f17509OooOo0o).f20397OooO0OO)));
            }
            az0VarOooO00o = gu0.OooO0O0(((Integer) this.f17510OooOoO0).intValue());
        }
        return new fv0((jv0) this.f17509OooOo0o, (pd0) this.f17507OooOo, az0VarOooO00o, (Integer) this.f17510OooOoO0);
    }

    public void OooOOOO(zm0 zm0Var, Uri uri, Map map, long j, long j2, v91 v91Var) throws oo0o0O0 {
        boolean z;
        boolean z2 = true;
        o000000 o000000Var = new o000000(zm0Var, j, j2);
        this.f17510OooOoO0 = o000000Var;
        if (((o00000O) this.f17507OooOo) != null) {
            return;
        }
        o00000O[] o00000oArrOooO0OO = ((o0000) this.f17509OooOo0o).OooO0OO(uri, map);
        int length = o00000oArrOooO0OO.length;
        pm0 pm0Var = rm0.f23913OooOo0o;
        xh0.OooOOoo(length, "expectedSize");
        om0 om0Var = new om0(length);
        if (length == 1) {
            this.f17507OooOo = o00000oArrOooO0OO[0];
        } else {
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                o00000O o00000o = o00000oArrOooO0OO[i];
                try {
                } catch (EOFException unused) {
                    z = ((o00000O) this.f17507OooOo) != null || o000000Var.f21650OooOoO0 == j;
                } catch (Throwable th) {
                    if (((o00000O) this.f17507OooOo) == null && o000000Var.f21650OooOoO0 != j) {
                        z2 = false;
                    }
                    af0.OooooO0(z2);
                    o000000Var.f21651OooOoOO = 0;
                    throw th;
                }
                if (o00000o.OooO0OO(o000000Var)) {
                    this.f17507OooOo = o00000o;
                    o000000Var.f21651OooOoOO = 0;
                    break;
                } else {
                    om0Var.OooO0Oo(o00000o.zzd());
                    z = ((o00000O) this.f17507OooOo) != null || o000000Var.f21650OooOoO0 == j;
                    af0.OooooO0(z);
                    o000000Var.f21651OooOoOO = 0;
                    i++;
                }
            }
            if (((o00000O) this.f17507OooOo) == null) {
                Iterator it = ii0.OooOoo0(rm0.OooOOOo(o00000oArrOooO0OO), new o0O0o00O(20)).iterator();
                StringBuilder sb = new StringBuilder();
                xh0.OoooO0(sb, it, ", ");
                String strOooOO0O = OooO0oO.OooOo.OooOO0O("None of the available extractors (", sb.toString(), ") could read the stream.");
                gn0 gn0VarOooO0oo = om0Var.OooO0oo();
                oo0o0O0 oo0o0o0 = new oo0o0O0(strOooOO0O, null, false, 1);
                rm0.OooOOOO(gn0VarOooO0oo);
                throw oo0o0o0;
            }
        }
        ((o00000O) this.f17507OooOo).OooO0o(v91Var);
    }

    public String toString() {
        switch (this.f17508OooOo0O) {
            case 1:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.f17509OooOo0o);
                sb.append('{');
                C1548ey c1548ey = (C1548ey) ((C1548ey) this.f17507OooOo).f18706OooOo;
                String str = "";
                while (c1548ey != null) {
                    Object obj = c1548ey.f18708OooOo0o;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
                    }
                    c1548ey = (C1548ey) c1548ey.f18706OooOo;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            case 2:
                int i = dr0.f18395OooO00o;
                sx0 sx0VarOooOo0o = wx0.OooOo0o();
                rx0 rx0Var = (rx0) this.f17509OooOo0o;
                int iOooOo = rx0Var.OooOo();
                sx0VarOooOo0o.OooO0Oo();
                ((wx0) sx0VarOooOo0o.f25822OooOo0o).zzc = iOooOo;
                for (qx0 qx0Var : rx0Var.OooOoo0()) {
                    tx0 tx0VarOooOo0o = vx0.OooOo0o();
                    String strOooOoOO = qx0Var.OooOo().OooOoOO();
                    tx0VarOooOo0o.OooO0Oo();
                    vx0.OooOoO((vx0) tx0VarOooOo0o.f25822OooOo0o, strOooOoOO);
                    int iOooOooo = qx0Var.OooOooo();
                    tx0VarOooOo0o.OooO0Oo();
                    vx0.OooOoOO((vx0) tx0VarOooOo0o.f25822OooOo0o, iOooOooo);
                    fy0 fy0VarOooOoO = qx0Var.OooOoO();
                    tx0VarOooOo0o.OooO0Oo();
                    ((vx0) tx0VarOooOo0o.f25822OooOo0o).zzf = fy0VarOooOoO.OooO00o();
                    int iOooOo0o = qx0Var.OooOo0o();
                    tx0VarOooOo0o.OooO0Oo();
                    ((vx0) tx0VarOooOo0o.f25822OooOo0o).zze = iOooOo0o;
                    vx0 vx0Var = (vx0) tx0VarOooOo0o.OooO0O0();
                    sx0VarOooOo0o.OooO0Oo();
                    wx0.OooOo((wx0) sx0VarOooOo0o.f25822OooOo0o, vx0Var);
                }
                return ((wx0) sx0VarOooOo0o.OooO0O0()).toString();
            default:
                return super.toString();
        }
    }

    public bi0(o0000 o0000Var) {
        this.f17508OooOo0O = 13;
        this.f17509OooOo0o = o0000Var;
    }

    public /* synthetic */ bi0(Object obj, Serializable serializable, Object obj2, int i) {
        this.f17508OooOo0O = i;
        this.f17509OooOo0o = obj;
        this.f17507OooOo = serializable;
        this.f17510OooOoO0 = obj2;
    }

    public /* synthetic */ bi0(HashMap map, qu0 qu0Var, wt0 wt0Var, Class cls) {
        this.f17508OooOo0O = 6;
        this.f17509OooOo0o = map;
        this.f17507OooOo = qu0Var;
        this.f17510OooOoO0 = wt0Var;
    }

    public bi0(int i) {
        this.f17508OooOo0O = i;
        switch (i) {
            case 8:
                this.f17509OooOo0o = null;
                this.f17507OooOo = null;
                this.f17510OooOoO0 = tq0.f24481Oooo0o;
                break;
            default:
                this.f17507OooOo = new ArrayDeque();
                this.f17510OooOoO0 = null;
                this.f17509OooOo0o = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                break;
        }
    }

    public bi0(AudioTrack audioTrack, C1643hi c1643hi) {
        this.f17508OooOo0O = 11;
        this.f17509OooOo0o = audioTrack;
        this.f17507OooOo = c1643hi;
        this.f17510OooOoO0 = new AudioRouting.OnRoutingChangedListener() { // from class: com.google.android.gms.internal.ads.f71
            public /* synthetic */ f71() {
            }

            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                bi0 bi0Var = this.f18800OooO00o;
                if (((f71) bi0Var.f17510OooOoO0) == null || audioRouting.getRoutedDevice() == null) {
                    return;
                }
                ((C1643hi) bi0Var.f17507OooOo).OooO(audioRouting.getRoutedDevice());
            }
        };
        audioTrack.addOnRoutingChangedListener((f71) this.f17510OooOoO0, new Handler(Looper.myLooper()));
    }

    public bi0(OooOOO0 oooOOO0, OooOo oooOo) {
        this.f17508OooOo0O = 15;
        this.f17509OooOo0o = oooOOO0;
        this.f17507OooOo = oooOo;
        this.f17510OooOoO0 = new o0OoOo0(new jb1());
    }

    public bi0(rx0 rx0Var, List list) {
        this.f17508OooOo0O = 2;
        this.f17509OooOo0o = rx0Var;
        this.f17507OooOo = list;
        this.f17510OooOoO0 = wt0.f25407OooO0O0;
    }

    public bi0(h71 h71Var) {
        this.f17508OooOo0O = 12;
        this.f17510OooOoO0 = h71Var;
        this.f17509OooOo0o = new Handler(Looper.myLooper());
        this.f17507OooOo = new g71(this);
    }

    public bi0(InterfaceC1723jp[] interfaceC1723jpArr) {
        this.f17508OooOo0O = 10;
        j71 j71Var = new j71();
        j71Var.f20219OooOOO0 = 0;
        j71Var.f20220OooOOOO = 0;
        j71Var.f20221OooOOOo = 0;
        byte[] bArr = i80.f19998OooO0o;
        j71Var.f20218OooOOO = bArr;
        j71Var.f20222OooOOo0 = bArr;
        C1835mq c1835mq = new C1835mq();
        c1835mq.f21323OooO0OO = 1.0f;
        c1835mq.f21324OooO0Oo = 1.0f;
        C1759ko c1759ko = C1759ko.f20636OooO0o0;
        c1835mq.f21326OooO0o0 = c1759ko;
        c1835mq.f21325OooO0o = c1759ko;
        c1835mq.f21327OooO0oO = c1759ko;
        c1835mq.f21328OooO0oo = c1759ko;
        ByteBuffer byteBuffer = InterfaceC1723jp.f20345OooO00o;
        c1835mq.f21330OooOO0O = byteBuffer;
        c1835mq.OooOO0o = byteBuffer.asShortBuffer();
        c1835mq.f21332OooOOO0 = byteBuffer;
        c1835mq.f21322OooO0O0 = -1;
        InterfaceC1723jp[] interfaceC1723jpArr2 = {j71Var, c1835mq};
        this.f17509OooOo0o = interfaceC1723jpArr2;
        System.arraycopy(interfaceC1723jpArr, 0, interfaceC1723jpArr2, 0, 0);
        this.f17507OooOo = j71Var;
        this.f17510OooOoO0 = c1835mq;
    }

    public bi0(String str) {
        this.f17508OooOo0O = 1;
        C1548ey c1548ey = new C1548ey(27);
        this.f17507OooOo = c1548ey;
        this.f17510OooOoO0 = c1548ey;
        this.f17509OooOo0o = str;
    }
}

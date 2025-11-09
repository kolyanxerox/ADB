package o000OO;

import OooOOoo.o0000OO0;
import Oooo0oO.o00000;
import OoooO0O.o000000;
import OoooO0O.o00000O;
import OoooO0O.o0000Ooo;
import OoooO0O.o000O000;
import OoooO0O.o000O0o;
import OoooO0O.o000Oo0;
import OoooO0O.o00O000;
import OoooO0O.o00oOoo;
import OoooO0O.o0O0ooO;
import OoooO0O.o0OOO0o;
import OoooO0O.oo0o0Oo;
import OoooOoO.oOO0O0;
import android.app.Application;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import o0000OOo.o00O000o;
import o0000OOo.o00OO0OO;

/* loaded from: classes2.dex */
public final class o0OoOo0 implements o00oOoo, o0000Oo.oo000o {

    /* renamed from: OooOo */
    public Object f30184OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f30185OooOo0O;

    /* renamed from: OooOo0o */
    public Object f30186OooOo0o;

    /* renamed from: OooOoO */
    public Object f30187OooOoO;

    /* renamed from: OooOoO0 */
    public Object f30188OooOoO0;

    /* renamed from: OooOoOO */
    public Object f30189OooOoOO;

    /* renamed from: OooOoo0 */
    public Object f30190OooOoo0;

    public /* synthetic */ o0OoOo0(o0000OO0 o0000oo02, o0O0ooO o0o0ooo, o0O0ooO o0o0ooo2, o00O000 o00o000, o00oOoo o00oooo, o00O000 o00o0002, int i) {
        this.f30185OooOo0O = i;
        this.f30186OooOo0o = o0000oo02;
        this.f30188OooOoO0 = o0o0ooo;
        this.f30187OooOoO = o0o0ooo2;
        this.f30189OooOoOO = o00o000;
        this.f30190OooOoo0 = o00oooo;
        this.f30184OooOo = o00o0002;
    }

    public static o0OoOo0 OooO00o(String str, com.google.crypto.tink.shaded.protobuf.OooOOO0 oooOOO0, o00O000o o00o000o, o00OO0OO o00oo0oo, Integer num) throws GeneralSecurityException {
        if (o00oo0oo == o00OO0OO.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new o0OoOo0(str, oooOOO0, o00o000o, o00oo0oo, num);
    }

    @Override // o0000Oo.oo000o
    public synchronized void OooO0O0(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() != ((o0000Oo.OooO0o) this.f30184OooOo).OooO0o0()) {
            throw new InvalidAlgorithmParameterException("Invalid header length");
        }
        if (byteBuffer.get() != ((o0000Oo.OooO0o) this.f30184OooOo).OooO0o0()) {
            throw new GeneralSecurityException("Invalid ciphertext");
        }
        this.f30190OooOoo0 = new byte[7];
        byte[] bArr2 = new byte[((o0000Oo.OooO0o) this.f30184OooOo).f29432OooO00o];
        byteBuffer.get(bArr2);
        byteBuffer.get((byte[]) this.f30190OooOoo0);
        o0000Oo.OooO0o oooO0o = (o0000Oo.OooO0o) this.f30184OooOo;
        byte[] bArrOooO0O0 = o00000.OooO0O0(oooO0o.f29436OooO0o, oooO0o.f29438OooO0oO, bArr2, bArr, oooO0o.f29432OooO00o + 32);
        o0000Oo.OooO0o oooO0o2 = (o0000Oo.OooO0o) this.f30184OooOo;
        oooO0o2.getClass();
        this.f30186OooOo0o = new SecretKeySpec(bArrOooO0O0, 0, oooO0o2.f29432OooO00o, "AES");
        o0000Oo.OooO0o oooO0o3 = (o0000Oo.OooO0o) this.f30184OooOo;
        oooO0o3.getClass();
        this.f30188OooOoO0 = new SecretKeySpec(bArrOooO0O0, oooO0o3.f29432OooO00o, 32, oooO0o3.f29433OooO0O0);
        this.f30187OooOoO = (Cipher) o0000Oo.Oooo0.f29463OooO0O0.f29465OooO00o.OooO00o("AES/CTR/NoPadding");
        o0000Oo.OooO0o oooO0o4 = (o0000Oo.OooO0o) this.f30184OooOo;
        oooO0o4.getClass();
        this.f30189OooOoOO = (Mac) o0000Oo.Oooo0.f29464OooO0OO.f29465OooO00o.OooO00o(oooO0o4.f29433OooO0O0);
    }

    public o0000Ooo OooO0OO() {
        Application application = (Application) ((o0000OO0) this.f30186OooOo0o).f13531OooOo0o;
        o00000O o00000o = (o00000O) ((o0O0ooO) this.f30188OooOoO0).zza();
        Handler handler = o000O0o.f13967OooO00o;
        o000Oo0.OooO0OO(handler);
        o000O000 o000o0002 = o000O0o.f13968OooO0O0;
        o000Oo0.OooO0OO(o000o0002);
        return new o0000Ooo(application, o00000o, handler, o000o0002, (OoooO0O.o00O000o) ((o0O0ooO) this.f30187OooOoO).zza(), ((Oooo.OooOo00) this.f30189OooOoOO).OooOOoo(), (oo0o0Oo) ((o000Ooo0.OooOO0) this.f30190OooOoo0).zza(), (o0OOO0o) ((o0O0ooO) this.f30184OooOo).zza());
    }

    @Override // o0000Oo.oo000o
    public synchronized void OooO0oO(ByteBuffer byteBuffer, int i, boolean z, ByteBuffer byteBuffer2) {
        int iPosition = byteBuffer.position();
        byte[] bArrOooO = o0000Oo.OooO0o.OooO((o0000Oo.OooO0o) this.f30184OooOo, (byte[]) this.f30190OooOoo0, i, z);
        int iRemaining = byteBuffer.remaining();
        int i2 = ((o0000Oo.OooO0o) this.f30184OooOo).f29434OooO0OO;
        if (iRemaining < i2) {
            throw new GeneralSecurityException("Ciphertext too short");
        }
        int i3 = (iRemaining - i2) + iPosition;
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.limit(i3);
        ByteBuffer byteBufferDuplicate2 = byteBuffer.duplicate();
        byteBufferDuplicate2.position(i3);
        ((Mac) this.f30189OooOoOO).init((SecretKeySpec) this.f30188OooOoO0);
        ((Mac) this.f30189OooOoOO).update(bArrOooO);
        ((Mac) this.f30189OooOoOO).update(byteBufferDuplicate);
        byte[] bArrCopyOf = Arrays.copyOf(((Mac) this.f30189OooOoOO).doFinal(), ((o0000Oo.OooO0o) this.f30184OooOo).f29434OooO0OO);
        byte[] bArr = new byte[((o0000Oo.OooO0o) this.f30184OooOo).f29434OooO0OO];
        byteBufferDuplicate2.get(bArr);
        if (!MessageDigest.isEqual(bArr, bArrCopyOf)) {
            throw new GeneralSecurityException("Tag mismatch");
        }
        byteBuffer.limit(i3);
        ((Cipher) this.f30187OooOoO).init(1, (SecretKeySpec) this.f30186OooOo0o, new IvParameterSpec(bArrOooO));
        ((Cipher) this.f30187OooOoO).doFinal(byteBuffer, byteBuffer2);
    }

    @Override // OoooO0O.o00O000
    public Object zza() {
        switch (this.f30185OooOo0O) {
            case 2:
                Application application = (Application) ((o0000OO0) this.f30186OooOo0o).f13531OooOo0o;
                return new oo0o0Oo(application, (o00000O) ((o0O0ooO) this.f30187OooOoO).zza(), (o0OOO0o) ((o0O0ooO) this.f30189OooOoOO).zza(), (o000000) ((o0000OO0) this.f30190OooOoo0).f13531OooOo0o, (OooO0oO.OooOOO0) this.f30184OooOo);
            default:
                return OooO0OO();
        }
    }

    public o0OoOo0(String str, Set set, String str2) {
        this.f30185OooOo0O = 1;
        oOO0O0 ooo0o0 = oOO0O0.f14941OooO0O0;
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f30188OooOoO0 = setUnmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.f30186OooOo0o = str;
        this.f30189OooOoOO = str2;
        this.f30190OooOoo0 = ooo0o0;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.f30187OooOoO = Collections.unmodifiableSet(hashSet);
    }

    public o0OoOo0(String str, com.google.crypto.tink.shaded.protobuf.OooOOO0 oooOOO0, o00O000o o00o000o, o00OO0OO o00oo0oo, Integer num) {
        this.f30185OooOo0O = 0;
        this.f30186OooOo0o = str;
        this.f30188OooOoO0 = o00oO0o.OooO0O0(str);
        this.f30187OooOoO = oooOOO0;
        this.f30189OooOoOO = o00o000o;
        this.f30190OooOoo0 = o00oo0oo;
        this.f30184OooOo = num;
    }

    public o0OoOo0(o0000Oo.OooO0o oooO0o) {
        this.f30185OooOo0O = 4;
        this.f30184OooOo = oooO0o;
    }
}

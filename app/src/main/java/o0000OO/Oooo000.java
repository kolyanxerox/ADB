package o0000Oo;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class Oooo000 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f29466OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o000oOoO f29467OooO0O0;

    public /* synthetic */ Oooo000(o000oOoO o000oooo2, int i) {
        this.f29466OooO00o = i;
        this.f29467OooO0O0 = o000oooo2;
    }

    public final Object OooO00o(String str) throws GeneralSecurityException {
        switch (this.f29466OooO00o) {
            case 0:
                String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
                ArrayList arrayList = new ArrayList();
                int i = 0;
                for (int i2 = 0; i2 < 2; i2++) {
                    Provider provider = Security.getProvider(strArr[i2]);
                    if (provider != null) {
                        arrayList.add(provider);
                    }
                }
                int size = arrayList.size();
                Exception exc = null;
                while (true) {
                    o000oOoO o000oooo2 = this.f29467OooO0O0;
                    if (i >= size) {
                        return o000oooo2.OooO0O0(str, null);
                    }
                    Object obj = arrayList.get(i);
                    i++;
                    try {
                        return o000oooo2.OooO0O0(str, (Provider) obj);
                    } catch (Exception e) {
                        if (exc == null) {
                            exc = e;
                        }
                    }
                }
            case 1:
                return this.f29467OooO0O0.OooO0O0(str, null);
            default:
                String[] strArr2 = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
                ArrayList arrayList2 = new ArrayList();
                int i3 = 0;
                for (int i4 = 0; i4 < 3; i4++) {
                    Provider provider2 = Security.getProvider(strArr2[i4]);
                    if (provider2 != null) {
                        arrayList2.add(provider2);
                    }
                }
                int size2 = arrayList2.size();
                Exception exc2 = null;
                while (i3 < size2) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    try {
                        return this.f29467OooO0O0.OooO0O0(str, (Provider) obj2);
                    } catch (Exception e2) {
                        if (exc2 == null) {
                            exc2 = e2;
                        }
                    }
                }
                throw new GeneralSecurityException("No good Provider found.", exc2);
        }
    }
}

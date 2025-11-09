package com.ironsource;

import android.text.TextUtils;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* renamed from: com.ironsource.zc */
/* loaded from: classes2.dex */
class CallableC3900zc implements Callable<C3071eb> {

    /* renamed from: d */
    private static final String f12955d = "FileWorkerThread";

    /* renamed from: e */
    private static final String f12956e = "X-Android-Protocols";

    /* renamed from: f */
    private static final String f12957f = "http/1.1,h2";

    /* renamed from: a */
    private final C3036db f12958a;

    /* renamed from: b */
    private final String f12959b;

    /* renamed from: c */
    private long f12960c;

    public CallableC3900zc(C3036db c3036db, String str, long j) {
        this.f12958a = c3036db;
        this.f12959b = str;
        this.f12960c = j;
    }

    /* renamed from: a */
    public int m13325a(byte[] bArr, String str) throws Exception {
        return IronSourceStorageUtils.saveFile(bArr, str);
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3071eb call() throws Throwable {
        CallableC3900zc callableC3900zc;
        int i;
        if (this.f12960c == 0) {
            this.f12960c = 1L;
        }
        C3071eb c3071ebM13327a = null;
        int i2 = 0;
        while (true) {
            if (i2 >= this.f12960c) {
                callableC3900zc = this;
                break;
            }
            callableC3900zc = this;
            c3071ebM13327a = callableC3900zc.m13327a(this.f12958a.m8293e(), i2, this.f12958a.m8289a(), this.f12958a.m8291c(), this.f12958a.m8294f());
            int iM8464b = c3071ebM13327a.m8464b();
            if (iM8464b != 1008 && iM8464b != 1009) {
                break;
            }
            i2++;
        }
        C3071eb c3071eb = c3071ebM13327a;
        if (c3071eb != null && c3071eb.m8463a() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(callableC3900zc.f12959b);
            String str = File.separator;
            sb.append(str);
            sb.append(callableC3900zc.f12958a.m8290b().getName());
            String string = sb.toString();
            String str2 = callableC3900zc.f12958a.m8292d() + str + C3109f9.f8518E + callableC3900zc.f12958a.m8290b().getName();
            try {
                if (m13325a(c3071eb.m8463a(), str2) == 0) {
                    c3071eb.m8460a(1006);
                    return c3071eb;
                }
                if (!m13328a(str2, string)) {
                    c3071eb.m8460a(1014);
                    return c3071eb;
                }
            } catch (FileNotFoundException e) {
                C3551q9.m11517d().m11519a(e);
                i = 1018;
                c3071eb.m8460a(i);
            } catch (Error e2) {
                C3551q9.m11517d().m11519a(e2);
                if (!TextUtils.isEmpty(e2.getMessage())) {
                    Logger.m12266i(f12955d, e2.getMessage());
                }
                i = 1019;
                c3071eb.m8460a(i);
            } catch (Exception e3) {
                C3551q9.m11517d().m11519a(e3);
                if (!TextUtils.isEmpty(e3.getMessage())) {
                    Logger.m12266i(f12955d, e3.getMessage());
                }
                c3071eb.m8460a(1009);
            }
        }
        return c3071eb;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x011b A[Catch: all -> 0x0117, PHI: r5 r9
  0x011b: PHI (r5v13 java.net.HttpURLConnection) = 
  (r5v8 java.net.HttpURLConnection)
  (r5v9 java.net.HttpURLConnection)
  (r5v10 java.net.HttpURLConnection)
  (r5v11 java.net.HttpURLConnection)
  (r5v14 java.net.HttpURLConnection)
 binds: [B:73:0x0119, B:92:0x014f, B:86:0x013e, B:98:0x0160, B:80:0x012d] A[DONT_GENERATE, DONT_INLINE]
  0x011b: PHI (r9v24 int) = (r9v14 int), (r9v17 int), (r9v19 int), (r9v21 int), (r9v27 int) binds: [B:73:0x0119, B:92:0x014f, B:86:0x013e, B:98:0x0160, B:80:0x012d] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #11 {all -> 0x0117, blocks: (B:70:0x0113, B:74:0x011b, B:79:0x012a, B:85:0x013b, B:91:0x014c, B:97:0x015d), top: B:115:0x001a }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.ironsource.C3071eb m13327a(java.lang.String r8, int r9, int r10, int r11, boolean r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.CallableC3900zc.m13327a(java.lang.String, int, int, int, boolean):com.ironsource.eb");
    }

    /* renamed from: a */
    public boolean m13328a(String str, String str2) throws Exception {
        return IronSourceStorageUtils.renameFile(str, str2);
    }

    /* renamed from: a */
    public byte[] m13329a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr, 0, 8192);
            if (i == -1) {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }
}

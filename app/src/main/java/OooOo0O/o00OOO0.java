package oOooo0o;

import android.os.Build;
import android.util.Log;
import com.google.android.gms.internal.measurement.o0OO0O0;
import com.unity3d.services.core.fid.Constants;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import o000OOO.OooOO0O;
import o00O0OO0.OooOO0;
import o00OOO0.o00oO0o;
import o00OOO0O.OooO0OO;
import o00OOOo.OooOo00;
import o00OOOoO.o0000;

/* loaded from: classes3.dex */
public class o00OOO0 extends o00OOOOo {

    /* renamed from: OooO0OO */
    public final /* synthetic */ int f33157OooO0OO = 1;

    /* renamed from: OooO0Oo */
    public final Object f33158OooO0Oo;

    /* renamed from: OooO0o */
    public final Object f33159OooO0o;

    /* renamed from: OooO0o0 */
    public final Object f33160OooO0o0;

    /* renamed from: OooO0oO */
    public final Object f33161OooO0oO;

    /* renamed from: OooO0oo */
    public final Object f33162OooO0oo;

    public o00OOO0(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f33158OooO0Oo = method;
        this.f33160OooO0o0 = method2;
        this.f33159OooO0o = method3;
        this.f33161OooO0oO = cls;
        this.f33162OooO0oo = cls2;
    }

    public static boolean OooOOO(String str, Class cls, Object obj) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
        } catch (NoSuchMethodException unused) {
            try {
                return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", null).invoke(obj, null)).booleanValue();
            } catch (NoSuchMethodException unused2) {
                return true;
            }
        }
    }

    @Override // oOooo0o.o00OOOOo
    public String OooO(SSLSocket sSLSocket) {
        switch (this.f33157OooO0OO) {
            case 0:
                OooOO0O oooOO0O = (OooOO0O) this.f33159OooO0o;
                if (oooOO0O == null || oooOO0O.OooO0oo(sSLSocket.getClass()) == null) {
                    return null;
                }
                try {
                    byte[] bArr = (byte[]) oooOO0O.OooOO0(sSLSocket, new Object[0]);
                    if (bArr != null) {
                        return new String(bArr, OooO0OO.f32334OooO);
                    }
                    return null;
                } catch (InvocationTargetException e) {
                    Throwable targetException = e.getTargetException();
                    if (targetException instanceof RuntimeException) {
                        throw ((RuntimeException) targetException);
                    }
                    AssertionError assertionError = new AssertionError("Unexpected exception");
                    assertionError.initCause(targetException);
                    throw assertionError;
                }
            default:
                try {
                    o00OOOO0 o00oooo0 = (o00OOOO0) Proxy.getInvocationHandler(((Method) this.f33160OooO0o0).invoke(null, sSLSocket));
                    boolean z = o00oooo0.f33166OooO0O0;
                    if (!z && o00oooo0.f33167OooO0OO == null) {
                        o00OOOOo.f33168OooO00o.OooOO0o(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                        return null;
                    }
                    if (z) {
                        return null;
                    }
                    return o00oooo0.f33167OooO0OO;
                } catch (IllegalAccessException e2) {
                    e = e2;
                    throw OooO0OO.OooO00o(e, "unable to get selected protocol");
                } catch (InvocationTargetException e3) {
                    e = e3;
                    throw OooO0OO.OooO00o(e, "unable to get selected protocol");
                }
        }
    }

    @Override // oOooo0o.o00OOOOo
    public void OooO00o(SSLSocket sSLSocket) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        switch (this.f33157OooO0OO) {
            case 1:
                try {
                    ((Method) this.f33159OooO0o).invoke(null, sSLSocket);
                    return;
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw OooO0OO.OooO00o(e, "unable to remove alpn");
                }
            default:
                return;
        }
    }

    @Override // oOooo0o.o00OOOOo
    public o0OO0O0 OooO0OO(X509TrustManager x509TrustManager) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        switch (this.f33157OooO0OO) {
            case 0:
                try {
                    Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
                    break;
                } catch (Exception unused) {
                    return super.OooO0OO(x509TrustManager);
                }
        }
        return super.OooO0OO(x509TrustManager);
    }

    @Override // oOooo0o.o00OOOOo
    public OooOo00 OooO0Oo(X509TrustManager x509TrustManager) throws NoSuchMethodException, SecurityException {
        switch (this.f33157OooO0OO) {
            case 0:
                try {
                    Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
                    declaredMethod.setAccessible(true);
                    break;
                } catch (NoSuchMethodException unused) {
                    return super.OooO0Oo(x509TrustManager);
                }
        }
        return super.OooO0Oo(x509TrustManager);
    }

    @Override // oOooo0o.o00OOOOo
    public void OooO0o(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        switch (this.f33157OooO0OO) {
            case 0:
                if (str != null) {
                    ((OooOO0O) this.f33158OooO0Oo).OooOO0O(sSLSocket, Boolean.TRUE);
                    ((OooOO0O) this.f33160OooO0o0).OooOO0O(sSLSocket, str);
                }
                OooOO0O oooOO0O = (OooOO0O) this.f33161OooO0oO;
                if (oooOO0O == null || oooOO0O.OooO0oo(sSLSocket.getClass()) == null) {
                    return;
                }
                o0000 o0000Var = new o0000();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    o00oO0o o00oo0o = (o00oO0o) list.get(i);
                    if (o00oo0o != o00oO0o.HTTP_1_0) {
                        o0000Var.OooOO0O(o00oo0o.f32276OooOo0O.length());
                        o0000Var.OooOOOO(o00oo0o.f32276OooOo0O);
                    }
                }
                try {
                    oooOO0O.OooOO0(sSLSocket, o0000Var.readByteArray(o0000Var.f32535OooOo0o));
                    return;
                } catch (InvocationTargetException e) {
                    Throwable targetException = e.getTargetException();
                    if (targetException instanceof RuntimeException) {
                        throw ((RuntimeException) targetException);
                    }
                    AssertionError assertionError = new AssertionError("Unexpected exception");
                    assertionError.initCause(targetException);
                    throw assertionError;
                }
            default:
                try {
                    ((Method) this.f33158OooO0Oo).invoke(null, sSLSocket, Proxy.newProxyInstance(o00OOOOo.class.getClassLoader(), new Class[]{(Class) this.f33161OooO0oO, (Class) this.f33162OooO0oo}, new o00OOOO0(o00OOOOo.OooO0O0(list))));
                    return;
                } catch (IllegalAccessException | InvocationTargetException e2) {
                    throw OooO0OO.OooO00o(e2, "unable to set alpn");
                }
        }
    }

    @Override // oOooo0o.o00OOOOo
    public void OooO0oO(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        switch (this.f33157OooO0OO) {
            case 0:
                try {
                    socket.connect(inetSocketAddress, i);
                    return;
                } catch (AssertionError e) {
                    if (!OooO0OO.OooOOOO(e)) {
                        throw e;
                    }
                    throw new IOException(e);
                } catch (ClassCastException e2) {
                    if (Build.VERSION.SDK_INT != 26) {
                        throw e2;
                    }
                    IOException iOException = new IOException("Exception in connect");
                    iOException.initCause(e2);
                    throw iOException;
                } catch (SecurityException e3) {
                    IOException iOException2 = new IOException("Exception in connect");
                    iOException2.initCause(e3);
                    throw iOException2;
                }
            default:
                super.OooO0oO(socket, inetSocketAddress, i);
                return;
        }
    }

    @Override // oOooo0o.o00OOOOo
    public SSLContext OooO0oo() {
        switch (this.f33157OooO0OO) {
            case 0:
                try {
                    return SSLContext.getInstance("TLS");
                } catch (NoSuchAlgorithmException e) {
                    throw new IllegalStateException("No TLS provider", e);
                }
            default:
                return super.OooO0oo();
        }
    }

    @Override // oOooo0o.o00OOOOo
    public Object OooOO0() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        switch (this.f33157OooO0OO) {
            case 0:
                OooOO0 oooOO0 = (OooOO0) this.f33162OooO0oo;
                Method method = oooOO0.f31373OooO00o;
                if (method == null) {
                    return null;
                }
                try {
                    Object objInvoke = method.invoke(null, null);
                    oooOO0.f31374OooO0O0.invoke(objInvoke, "response.body().close()");
                    return objInvoke;
                } catch (Exception unused) {
                    return null;
                }
            default:
                return super.OooOO0();
        }
    }

    @Override // oOooo0o.o00OOOOo
    public boolean OooOO0O(String str) throws ClassNotFoundException {
        switch (this.f33157OooO0OO) {
            case 0:
                try {
                    Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
                    return OooOOO(str, cls, cls.getMethod(Constants.GET_INSTANCE, null).invoke(null, null));
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    return true;
                } catch (IllegalAccessException e) {
                    e = e;
                    throw OooO0OO.OooO00o(e, "unable to determine cleartext support");
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    throw OooO0OO.OooO00o(e, "unable to determine cleartext support");
                } catch (InvocationTargetException e3) {
                    e = e3;
                    throw OooO0OO.OooO00o(e, "unable to determine cleartext support");
                }
            default:
                return super.OooOO0O(str);
        }
    }

    @Override // oOooo0o.o00OOOOo
    public void OooOO0o(int i, String str, Throwable th) {
        int iMin;
        switch (this.f33157OooO0OO) {
            case 0:
                int i2 = i != 5 ? 3 : 5;
                if (th != null) {
                    str = str + '\n' + Log.getStackTraceString(th);
                }
                int length = str.length();
                int i3 = 0;
                while (i3 < length) {
                    int iIndexOf = str.indexOf(10, i3);
                    if (iIndexOf == -1) {
                        iIndexOf = length;
                    }
                    while (true) {
                        iMin = Math.min(iIndexOf, i3 + 4000);
                        Log.println(i2, "OkHttp", str.substring(i3, iMin));
                        if (iMin >= iIndexOf) {
                            break;
                        } else {
                            i3 = iMin;
                        }
                    }
                    i3 = iMin + 1;
                }
                break;
            default:
                super.OooOO0o(i, str, th);
                break;
        }
    }

    @Override // oOooo0o.o00OOOOo
    public void OooOOO0(String str, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        switch (this.f33157OooO0OO) {
            case 0:
                OooOO0 oooOO0 = (OooOO0) this.f33162OooO0oo;
                oooOO0.getClass();
                if (obj != null) {
                    try {
                        oooOO0.f31375OooO0OO.invoke(obj, null);
                        break;
                    } catch (Exception unused) {
                    }
                }
                OooOO0o(5, str, null);
                break;
            default:
                super.OooOOO0(str, obj);
                break;
        }
    }

    public o00OOO0(OooOO0O oooOO0O, OooOO0O oooOO0O2, OooOO0O oooOO0O3, OooOO0O oooOO0O4) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls.getMethod("get", null);
            method2 = cls.getMethod("open", String.class);
            method = cls.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f33162OooO0oo = new OooOO0(method3, method2, method);
        this.f33158OooO0Oo = oooOO0O;
        this.f33160OooO0o0 = oooOO0O2;
        this.f33159OooO0o = oooOO0O3;
        this.f33161OooO0oO = oooOO0O4;
    }
}

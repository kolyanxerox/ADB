package oOooo0o;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import o00OOO0O.OooO0OO;

/* loaded from: classes3.dex */
public final class o0o0Oo extends o00OOOOo {

    /* renamed from: OooO0OO */
    public final Method f33170OooO0OO;

    /* renamed from: OooO0Oo */
    public final Method f33171OooO0Oo;

    public o0o0Oo(Method method, Method method2) {
        this.f33170OooO0OO = method;
        this.f33171OooO0Oo = method2;
    }

    @Override // oOooo0o.o00OOOOo
    public final String OooO(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f33171OooO0Oo.invoke(sSLSocket, null);
            if (str != null) {
                if (!str.equals("")) {
                    return str;
                }
            }
        } catch (IllegalAccessException e) {
            throw OooO0OO.OooO00o(e, "failed to get ALPN selected protocol");
        } catch (InvocationTargetException e2) {
            if (!(e2.getCause() instanceof UnsupportedOperationException)) {
                throw OooO0OO.OooO00o(e2, "failed to get ALPN selected protocol");
            }
        }
        return null;
    }

    @Override // oOooo0o.o00OOOOo
    public final void OooO0o(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList arrayListOooO0O0 = o00OOOOo.OooO0O0(list);
            this.f33170OooO0OO.invoke(sSLParameters, arrayListOooO0O0.toArray(new String[arrayListOooO0O0.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw OooO0OO.OooO00o(e, "unable to set ssl parameters");
        }
    }
}

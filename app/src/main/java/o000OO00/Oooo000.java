package o000oo00;

import android.content.ContextWrapper;
import android.net.nsd.NsdManager;
import android.util.Log;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import o00O0.o0O0O00;

/* loaded from: classes2.dex */
public final class Oooo000 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f31088OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public boolean f31089OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public boolean f31090OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public Object f31091OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final Object f31092OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final Object f31093OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final Object f31094OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final Object f31095OooO0oo;

    public Oooo000(ContextWrapper contextWrapper, String str, OooOo00 oooOo00) {
        this.f31088OooO00o = 0;
        this.f31089OooO0O0 = false;
        this.f31090OooO0OO = false;
        this.f31091OooO0Oo = null;
        this.f31093OooO0o0 = str;
        this.f31095OooO0oo = oooOo00;
        this.f31092OooO0o = new OooOOOO(this);
        this.f31094OooO0oO = (NsdManager) contextWrapper.getSystemService(NsdManager.class);
    }

    public static boolean OooO00o(InetAddress inetAddress) {
        if (inetAddress != null) {
            try {
                ArrayList list = Collections.list(NetworkInterface.getNetworkInterfaces());
                int size = list.size();
                int i = 0;
                while (i < size) {
                    Object obj = list.get(i);
                    i++;
                    ArrayList list2 = Collections.list(((NetworkInterface) obj).getInetAddresses());
                    int size2 = list2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = list2.get(i2);
                        i2++;
                        if (Objects.equals(inetAddress.getHostAddress(), ((InetAddress) obj2).getHostAddress())) {
                            return true;
                        }
                    }
                }
            } catch (SocketException e) {
                Log.e("AdbMdns", "Error getting network interfaces", e);
            }
        }
        return false;
    }

    public void OooO0O0() {
        if (this.f31090OooO0OO) {
            return;
        }
        this.f31090OooO0OO = true;
        if (this.f31089OooO0O0) {
            return;
        }
        ((NsdManager) this.f31094OooO0oO).discoverServices((String) this.f31093OooO0o0, 1, (OooOOOO) this.f31092OooO0o);
    }

    public void OooO0OO() {
        if (this.f31090OooO0OO) {
            this.f31090OooO0OO = false;
            if (this.f31089OooO0O0) {
                ((NsdManager) this.f31094OooO0oO).stopServiceDiscovery((OooOOOO) this.f31092OooO0o);
            }
        }
    }

    public String toString() {
        switch (this.f31088OooO00o) {
            case 1:
                ArrayList arrayList = new ArrayList();
                if (this.f31089OooO0O0) {
                    arrayList.add("isRegularFile");
                }
                if (this.f31090OooO0OO) {
                    arrayList.add("isDirectory");
                }
                Long l = (Long) this.f31091OooO0Oo;
                if (l != null) {
                    arrayList.add("byteCount=" + l);
                }
                Long l2 = (Long) this.f31093OooO0o0;
                if (l2 != null) {
                    arrayList.add("createdAt=" + l2);
                }
                Long l3 = (Long) this.f31092OooO0o;
                if (l3 != null) {
                    arrayList.add("lastModifiedAt=" + l3);
                }
                Long l4 = (Long) this.f31094OooO0oO;
                if (l4 != null) {
                    arrayList.add("lastAccessedAt=" + l4);
                }
                Map map = (Map) this.f31095OooO0oo;
                if (!map.isEmpty()) {
                    arrayList.add("extras=" + map);
                }
                return o00O0.OooOo00.OooOooo(arrayList, ", ", "FileMetadata(", ")", null, 56);
            default:
                return super.toString();
        }
    }

    public Oooo000(boolean z, boolean z2, Long l, Long l2, Long l3, Long l4) {
        this.f31088OooO00o = 1;
        o00O0.o00oO0o o00oo0o = o00O0.o00oO0o.f31247OooOo0O;
        this.f31089OooO0O0 = z;
        this.f31090OooO0OO = z2;
        this.f31091OooO0Oo = l;
        this.f31093OooO0o0 = l2;
        this.f31092OooO0o = l3;
        this.f31094OooO0oO = l4;
        this.f31095OooO0oo = o0O0O00.OooOo(o00oo0o);
    }
}

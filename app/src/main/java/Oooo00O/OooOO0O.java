package Oooo00O;

import OooOooo.o000O00O;
import OooOooo.o000O0Oo;
import OooOooo.o000Oo0;
import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes2.dex */
public abstract class OooOO0O {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;

    @NonNull
    public static final String DEFAULT_ACCOUNT = "<<default account>>";

    @NonNull
    public static final String KEY_PENDING_INTENT = "pendingIntent";

    /* renamed from: OooOo */
    public long f13735OooOo;

    /* renamed from: OooOo0O */
    public int f13736OooOo0O;

    /* renamed from: OooOo0o */
    public long f13737OooOo0o;

    /* renamed from: OooOoO */
    public long f13738OooOoO;

    /* renamed from: OooOoO0 */
    public int f13739OooOoO0;

    /* renamed from: OooOoOO */
    public volatile String f13740OooOoOO;

    /* renamed from: OooOoo */
    public final Context f13741OooOoo;

    /* renamed from: OooOoo0 */
    public OooO0oO.Oooo000 f13742OooOoo0;

    /* renamed from: OooOooO */
    public final Looper f13743OooOooO;

    /* renamed from: OooOooo */
    public final o000OO f13744OooOooo;

    /* renamed from: Oooo */
    public final OooO0OO f13745Oooo;

    /* renamed from: Oooo0 */
    public final Object f13746Oooo0;

    /* renamed from: Oooo000 */
    public final o000O0Oo f13747Oooo000;

    /* renamed from: Oooo00O */
    public final o00000O0 f13748Oooo00O;

    /* renamed from: Oooo00o */
    public final Object f13749Oooo00o;

    /* renamed from: Oooo0O0 */
    public oo0o0Oo f13750Oooo0O0;

    /* renamed from: Oooo0OO */
    public OooO f13751Oooo0OO;

    /* renamed from: Oooo0o */
    public final ArrayList f13752Oooo0o;

    /* renamed from: Oooo0o0 */
    public IInterface f13753Oooo0o0;

    /* renamed from: Oooo0oO */
    public o00000OO f13754Oooo0oO;

    /* renamed from: Oooo0oo */
    public int f13755Oooo0oo;

    /* renamed from: OoooO */
    public volatile String f13756OoooO;

    /* renamed from: OoooO0 */
    public final int f13757OoooO0;

    /* renamed from: OoooO00 */
    public final OooO0o f13758OoooO00;

    /* renamed from: OoooO0O */
    public final String f13759OoooO0O;

    /* renamed from: OoooOO0 */
    public o000Oo0 f13760OoooOO0;

    /* renamed from: OoooOOO */
    public volatile o0000O00 f13761OoooOOO;

    /* renamed from: OoooOOo */
    public final AtomicInteger f13762OoooOOo;
    public boolean o000oOoO;

    /* renamed from: OoooOo0 */
    public static final o000O00O[] f13734OoooOo0 = new o000O00O[0];

    @NonNull
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    /* JADX WARN: Illegal instructions before constructor call */
    public OooOO0O(int i, OooO0OO oooO0OO, OooO0o oooO0o, Context context, Looper looper) {
        o000OO o000ooOooO00o = o000OO.OooO00o(context);
        o000O0Oo o000o0oo2 = o000O0Oo.f13671OooO0O0;
        o000000O.OooO0oo(oooO0OO);
        o000000O.OooO0oo(oooO0o);
        this(context, looper, o000ooOooO00o, o000o0oo2, i, oooO0OO, oooO0o, null);
    }

    public static /* bridge */ /* synthetic */ boolean OooO(OooOO0O oooOO0O, int i, int i2, IInterface iInterface) {
        synchronized (oooOO0O.f13749Oooo00o) {
            try {
                if (oooOO0O.f13755Oooo0oo != i) {
                    return false;
                }
                oooOO0O.OooOO0(iInterface, i2);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract IInterface OooO0O0(IBinder iBinder);

    public Bundle OooO0OO() {
        return new Bundle();
    }

    public Set OooO0Oo() {
        return Collections.EMPTY_SET;
    }

    public abstract String OooO0o();

    public abstract String OooO0o0();

    public boolean OooO0oO() {
        return getMinApkVersion() >= 211700000;
    }

    public final void OooO0oo(o000Oo0 o000oo02) {
        this.f13739OooOoO0 = o000oo02.OooO0o0();
        this.f13738OooOoO = System.currentTimeMillis();
    }

    public final void OooOO0(IInterface iInterface, int i) {
        OooO0oO.Oooo000 oooo000;
        o000000O.OooO0O0((i == 4) == (iInterface != null));
        synchronized (this.f13749Oooo00o) {
            try {
                this.f13755Oooo0oo = i;
                this.f13753Oooo0o0 = iInterface;
                Bundle bundle = null;
                if (i == 1) {
                    o00000OO o00000oo2 = this.f13754Oooo0oO;
                    if (o00000oo2 != null) {
                        o000OO o000oo2 = this.f13744OooOooo;
                        String str = (String) this.f13742OooOoo0.f13287OooOo0o;
                        o000000O.OooO0oo(str);
                        this.f13742OooOoo0.getClass();
                        if (this.f13759OoooO0O == null) {
                            this.f13741OooOoo.getClass();
                        }
                        o000oo2.OooO0OO(str, o00000oo2, this.f13742OooOoo0.f13286OooOo0O);
                        this.f13754Oooo0oO = null;
                    }
                } else if (i == 2 || i == 3) {
                    o00000OO o00000oo3 = this.f13754Oooo0oO;
                    if (o00000oo3 != null && (oooo000 = this.f13742OooOoo0) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + ((String) oooo000.f13287OooOo0o) + " on com.google.android.gms");
                        o000OO o000oo3 = this.f13744OooOooo;
                        String str2 = (String) this.f13742OooOoo0.f13287OooOo0o;
                        o000000O.OooO0oo(str2);
                        this.f13742OooOoo0.getClass();
                        if (this.f13759OoooO0O == null) {
                            this.f13741OooOoo.getClass();
                        }
                        o000oo3.OooO0OO(str2, o00000oo3, this.f13742OooOoo0.f13286OooOo0O);
                        this.f13762OoooOOo.incrementAndGet();
                    }
                    o00000OO o00000oo4 = new o00000OO(this, this.f13762OoooOOo.get());
                    this.f13754Oooo0oO = o00000oo4;
                    String strOooO0o = OooO0o();
                    boolean zOooO0oO = OooO0oO();
                    this.f13742OooOoo0 = new OooO0oO.Oooo000(strOooO0o, zOooO0oO);
                    if (zOooO0oO && getMinApkVersion() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((String) this.f13742OooOoo0.f13287OooOo0o)));
                    }
                    o000OO o000oo4 = this.f13744OooOooo;
                    String str3 = (String) this.f13742OooOoo0.f13287OooOo0o;
                    o000000O.OooO0oo(str3);
                    this.f13742OooOoo0.getClass();
                    String name = this.f13759OoooO0O;
                    if (name == null) {
                        name = this.f13741OooOoo.getClass().getName();
                    }
                    o000Oo0 o000oo0OooO0O0 = o000oo4.OooO0O0(new o0000oo(str3, this.f13742OooOoo0.f13286OooOo0O), o00000oo4, name, null);
                    if (!o000oo0OooO0O0.OooOO0()) {
                        Log.w("GmsClient", "unable to connect to service: " + ((String) this.f13742OooOoo0.f13287OooOo0o) + " on com.google.android.gms");
                        int iOooO0o0 = o000oo0OooO0O0.OooO0o0() == -1 ? 16 : o000oo0OooO0O0.OooO0o0();
                        if (o000oo0OooO0O0.OooO0oO() != null) {
                            bundle = new Bundle();
                            bundle.putParcelable(KEY_PENDING_INTENT, o000oo0OooO0O0.OooO0oO());
                        }
                        int i2 = this.f13762OoooOOo.get();
                        o0000 o0000Var = new o0000(this, iOooO0o0, bundle);
                        o00000O0 o00000o02 = this.f13748Oooo00O;
                        o00000o02.sendMessage(o00000o02.obtainMessage(7, i2, -1, o0000Var));
                    }
                } else if (i == 4) {
                    o000000O.OooO0oo(iInterface);
                    this.f13735OooOo = System.currentTimeMillis();
                }
            } finally {
            }
        }
    }

    public void checkAvailabilityAndConnect() {
        int iOooO0OO = this.f13747Oooo000.OooO0OO(this.f13741OooOoo, getMinApkVersion());
        if (iOooO0OO == 0) {
            connect(new Oooo000(this));
            return;
        }
        OooOO0(null, 1);
        this.f13751Oooo0OO = new Oooo000(this);
        int i = this.f13762OoooOOo.get();
        o00000O0 o00000o02 = this.f13748Oooo00O;
        o00000o02.sendMessage(o00000o02.obtainMessage(3, i, iOooO0OO, null));
    }

    public void connect(@NonNull OooO oooO) {
        o000000O.OooO(oooO, "Connection progress callbacks cannot be null.");
        this.f13751Oooo0OO = oooO;
        OooOO0(null, 2);
    }

    public void disconnect() {
        this.f13762OoooOOo.incrementAndGet();
        synchronized (this.f13752Oooo0o) {
            try {
                int size = this.f13752Oooo0o.size();
                for (int i = 0; i < size; i++) {
                    o0Oo0oo o0oo0oo = (o0Oo0oo) this.f13752Oooo0o.get(i);
                    synchronized (o0oo0oo) {
                        o0oo0oo.f13829OooO00o = null;
                    }
                }
                this.f13752Oooo0o.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f13746Oooo0) {
            this.f13750Oooo0O0 = null;
        }
        OooOO0(null, 1);
    }

    public void dump(@NonNull String str, @NonNull FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @NonNull String[] strArr) {
        int i;
        IInterface iInterface;
        oo0o0Oo oo0o0oo;
        synchronized (this.f13749Oooo00o) {
            i = this.f13755Oooo0oo;
            iInterface = this.f13753Oooo0o0;
        }
        synchronized (this.f13746Oooo0) {
            oo0o0oo = this.f13750Oooo0O0;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i == 4) {
            printWriter.print("CONNECTED");
        } else if (i != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) OooO0o0()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (oo0o0oo == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(oo0o0oo.f13839OooOo0O)));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f13735OooOo > 0) {
            PrintWriter printWriterAppend = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j = this.f13735OooOo;
            printWriterAppend.println(j + StringUtils.SPACE + simpleDateFormat.format(new Date(j)));
        }
        if (this.f13737OooOo0o > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i2 = this.f13736OooOo0O;
            if (i2 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i2 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i2 != 3) {
                printWriter.append((CharSequence) String.valueOf(i2));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.f13737OooOo0o;
            printWriterAppend2.println(j2 + StringUtils.SPACE + simpleDateFormat.format(new Date(j2)));
        }
        if (this.f13738OooOoO > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) o00O0.o000OOo.OooO0o0(this.f13739OooOoO0));
            PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j3 = this.f13738OooOoO;
            printWriterAppend3.println(j3 + StringUtils.SPACE + simpleDateFormat.format(new Date(j3)));
        }
    }

    @Nullable
    public Account getAccount() {
        return null;
    }

    @NonNull
    public o000O00O[] getApiFeatures() {
        return f13734OoooOo0;
    }

    @Nullable
    public Oooo0o0.OooO0o getAttributionSourceWrapper() {
        return null;
    }

    @Nullable
    public final o000O00O[] getAvailableFeatures() {
        o0000O00 o0000o00 = this.f13761OoooOOO;
        if (o0000o00 == null) {
            return null;
        }
        return o0000o00.f13802OooOo0o;
    }

    @Nullable
    public Bundle getConnectionHint() {
        return null;
    }

    @NonNull
    public final Context getContext() {
        return this.f13741OooOoo;
    }

    @NonNull
    public String getEndpointPackageName() {
        if (!isConnected() || this.f13742OooOoo0 == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return "com.google.android.gms";
    }

    public int getGCoreServiceId() {
        return this.f13757OoooO0;
    }

    @Nullable
    public String getLastDisconnectMessage() {
        return this.f13740OooOoOO;
    }

    @NonNull
    public final Looper getLooper() {
        return this.f13743OooOooO;
    }

    public int getMinApkVersion() {
        return o000O0Oo.f13670OooO00o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @WorkerThread
    public void getRemoteService(@Nullable OooOo00 oooOo00, @NonNull Set<Scope> set) {
        Bundle bundleOooO0OO = OooO0OO();
        String str = Build.VERSION.SDK_INT < 31 ? this.f13756OoooO : this.f13756OoooO;
        int i = this.f13757OoooO0;
        int i2 = o000O0Oo.f13670OooO00o;
        Scope[] scopeArr = OooOOO.f13763Oooo0;
        Bundle bundle = new Bundle();
        o000O00O[] o000o00oArr = OooOOO.f13764Oooo0O0;
        OooOOO oooOOO = new OooOOO(6, i, i2, null, null, scopeArr, bundle, null, o000o00oArr, o000o00oArr, true, 0, false, str);
        oooOOO.f13769OooOoO0 = this.f13741OooOoo.getPackageName();
        oooOOO.f13772OooOoo0 = bundleOooO0OO;
        if (set != null) {
            oooOOO.f13770OooOoOO = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(DEFAULT_ACCOUNT, "com.google");
            }
            oooOOO.f13771OooOoo = account;
            if (oooOo00 != 0) {
                oooOOO.f13768OooOoO = ((OoooO0.OooO0o) oooOo00).f13894OooOo0o;
            }
        } else if (requiresAccount()) {
            oooOOO.f13771OooOoo = getAccount();
        }
        oooOOO.f13773OooOooO = f13734OoooOo0;
        oooOOO.f13774OooOooo = getApiFeatures();
        if (usesClientTelemetry()) {
            oooOOO.f13777Oooo00o = true;
        }
        try {
            synchronized (this.f13746Oooo0) {
                try {
                    oo0o0Oo oo0o0oo = this.f13750Oooo0O0;
                    if (oo0o0oo != null) {
                        oo0o0oo.OooO(new o00000O(this, this.f13762OoooOOo.get()), oooOOO);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            triggerConnectionSuspended(3);
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i3 = this.f13762OoooOOo.get();
            o0000Ooo o0000ooo = new o0000Ooo(this, 8, null, null);
            o00000O0 o00000o02 = this.f13748Oooo00O;
            o00000o02.sendMessage(o00000o02.obtainMessage(1, i3, -1, o0000ooo));
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i32 = this.f13762OoooOOo.get();
            o0000Ooo o0000ooo2 = new o0000Ooo(this, 8, null, null);
            o00000O0 o00000o022 = this.f13748Oooo00O;
            o00000o022.sendMessage(o00000o022.obtainMessage(1, i32, -1, o0000ooo2));
        }
    }

    @NonNull
    public final IInterface getService() throws DeadObjectException {
        IInterface iInterface;
        synchronized (this.f13749Oooo00o) {
            try {
                if (this.f13755Oooo0oo == 5) {
                    throw new DeadObjectException();
                }
                if (!isConnected()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.f13753Oooo0o0;
                o000000O.OooO(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    @Nullable
    public IBinder getServiceBrokerBinder() {
        synchronized (this.f13746Oooo0) {
            try {
                oo0o0Oo oo0o0oo = this.f13750Oooo0O0;
                if (oo0o0oo == null) {
                    return null;
                }
                return oo0o0oo.f13839OooOo0O;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NonNull
    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    @Nullable
    public OooOOO0 getTelemetryConfiguration() {
        o0000O00 o0000o00 = this.f13761OoooOOO;
        if (o0000o00 == null) {
            return null;
        }
        return o0000o00.f13803OooOoO0;
    }

    public boolean hasConnectionInfo() {
        return this.f13761OoooOOO != null;
    }

    public boolean isConnected() {
        boolean z;
        synchronized (this.f13749Oooo00o) {
            z = this.f13755Oooo0oo == 4;
        }
        return z;
    }

    public boolean isConnecting() {
        boolean z;
        synchronized (this.f13749Oooo00o) {
            int i = this.f13755Oooo0oo;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public void onUserSignOut(@NonNull OooOO0 oooOO0) {
        o000Ooo0.OooOO0 oooOO02 = (o000Ooo0.OooOO0) oooOO0;
        ((com.google.android.gms.common.api.internal.Oooo0) oooOO02.f30538OooOo0o).f16725Oooo00o.f16711Oooo00o.post(new Oooo.OooOOO(oooOO02, 13));
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionTag(@NonNull String str) {
        this.f13756OoooO = str;
    }

    public void triggerConnectionSuspended(int i) {
        int i2 = this.f13762OoooOOo.get();
        o00000O0 o00000o02 = this.f13748Oooo00O;
        o00000o02.sendMessage(o00000o02.obtainMessage(6, i2, i));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    public OooOO0O(Context context, Looper looper, o000OO o000oo2, o000O0Oo o000o0oo2, int i, OooO0OO oooO0OO, OooO0o oooO0o, String str) {
        this.f13740OooOoOO = null;
        this.f13749Oooo00o = new Object();
        this.f13746Oooo0 = new Object();
        this.f13752Oooo0o = new ArrayList();
        this.f13755Oooo0oo = 1;
        this.f13760OoooOO0 = null;
        this.o000oOoO = false;
        this.f13761OoooOOO = null;
        this.f13762OoooOOo = new AtomicInteger(0);
        o000000O.OooO(context, "Context must not be null");
        this.f13741OooOoo = context;
        o000000O.OooO(looper, "Looper must not be null");
        this.f13743OooOooO = looper;
        o000000O.OooO(o000oo2, "Supervisor must not be null");
        this.f13744OooOooo = o000oo2;
        o000000O.OooO(o000o0oo2, "API availability must not be null");
        this.f13747Oooo000 = o000o0oo2;
        this.f13748Oooo00O = new o00000O0(this, looper);
        this.f13757OoooO0 = i;
        this.f13745Oooo = oooO0OO;
        this.f13758OoooO00 = oooO0o;
        this.f13759OoooO0O = str;
    }

    public void disconnect(@NonNull String str) {
        this.f13740OooOoOO = str;
        disconnect();
    }

    public void setAttributionSourceWrapper(@NonNull Oooo0o0.OooO0o oooO0o) {
    }
}

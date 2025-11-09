package o000Ooo;

import android.graphics.Rect;
import android.os.BadParcelableException;
import android.os.Handler;
import android.os.NetworkOnMainThreadException;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.internal.measurement.o000O0O0;
import com.google.android.gms.internal.measurement.o00O00;
import com.google.android.gms.internal.measurement.o00O00OO;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import o0000oOO.o0O00;
import o000oo00.OooOo00;
import o000ooOO.o000O0Oo;
import o000ooo.o0000O00;
import o000oooo.o00O00O;
import o000oooo.o0O0ooO;
import o00O0oo.o0000O;
import o00O0oo.o0000O0;
import o00O0oo.o000O000;
import o00O0oo.o000OO;
import o0ooOO0.OooOOO0;
import org.chromium.net.OooO0OO;

/* loaded from: classes2.dex */
public final class o00oO0o implements SuccessContinuation, OnSuccessListener, OnFailureListener, OnCanceledListener, OooOo00, OnUserEarnedRewardListener, OnCompleteListener, OooOOO0, OnApplyWindowInsetsListener, OooO0OO {

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f30486OooOo0O;

    /* renamed from: OooOo0o */
    public Object f30487OooOo0o;

    public /* synthetic */ o00oO0o(int i, boolean z) {
        this.f30486OooOo0O = i;
    }

    @Override // org.chromium.net.OooO0OO
    public FileChannel OooO00o() throws IOException {
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) this.f30487OooOo0o;
        if (parcelFileDescriptor.getStatSize() != -1) {
            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor).getChannel();
        }
        parcelFileDescriptor.close();
        throw new IllegalArgumentException("Not a file: " + parcelFileDescriptor);
    }

    @Override // o000oo00.OooOo00
    public void OooO0O0(int i, String str, boolean z) {
        ((Handler) this.f30487OooOo0o).post(new o000oo00.Oooo0(str, i, 0, z));
    }

    public void OooO0OO(String str, String str2) {
        ArrayList arrayList = (ArrayList) this.f30487OooOo0o;
        arrayList.add(str);
        arrayList.add(str2.trim());
    }

    public synchronized void OooO0Oo(o00OOO0.o00000O0 o00000o02) {
        ((LinkedHashSet) this.f30487OooOo0o).remove(o00000o02);
    }

    public void OooO0o(o0O00 o0o00) {
        o00O00OO o00o00oo = (o00O00OO) this.f30487OooOo0o;
        o00o00oo.getClass();
        ArrayList arrayList = o00o00oo.f26527OooO0OO;
        synchronized (arrayList) {
            for (int i = 0; i < arrayList.size(); i++) {
                try {
                    if (o0o00.equals(((Pair) arrayList.get(i)).first)) {
                        Log.w("FA", "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            o00O00 o00o00 = new o00O00(o0o00);
            arrayList.add(new Pair(o0o00, o00o00));
            if (o00o00oo.f26531OooO0oO != null) {
                try {
                    o00o00oo.f26531OooO0oO.registerOnMeasurementEventListener(o00o00);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w("FA", "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            o00o00oo.OooO0OO(new o000O0O0(o00o00oo, o00o00));
        }
    }

    public void OooO0o0() {
        switch (this.f30486OooOo0O) {
            case 6:
                OoooO0O.o00000OO o00000oo2 = (OoooO0O.o00000OO) this.f30487OooOo0o;
                ((o0000O00) o00000oo2.f13922OooOoO0).f31123OooO0O0.put(((o000O0Oo) o00000oo2.f13919OooOo).f31113OooO00o, (o0O0ooO) o00000oo2.f13921OooOo0o);
                break;
            case 7:
                OoooO0O.o00000OO o00000oo3 = (OoooO0O.o00000OO) this.f30487OooOo0o;
                ((o0000O00) o00000oo3.f13922OooOoO0).f31123OooO0O0.put(((o000O0Oo) o00000oo3.f13919OooOo).f31113OooO00o, (o0O0ooO) o00000oo3.f13921OooOo0o);
                break;
            case 8:
            default:
                OoooO0O.o00000OO o00000oo4 = (OoooO0O.o00000OO) this.f30487OooOo0o;
                ((o0000O00) o00000oo4.f13922OooOoO0).f31123OooO0O0.put(((o000O0Oo) o00000oo4.f13919OooOo).f31113OooO00o, (o00oOoo.o0O0O00) o00000oo4.f13921OooOo0o);
                break;
            case 9:
                OoooO0O.o00000OO o00000oo5 = (OoooO0O.o00000OO) this.f30487OooOo0o;
                ((o0000O00) o00000oo5.f13922OooOoO0).f31123OooO0O0.put(((o000O0Oo) o00000oo5.f13919OooOo).f31113OooO00o, (o00oOoo.o0O0O00) o00000oo5.f13921OooOo0o);
                break;
        }
    }

    public void OooO0oO(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f30487OooOo0o;
            if (i >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public void OooO0oo(String str, String str2) {
        o00OOO0.o000oOoO.OooO00o(str);
        o00OOO0.o000oOoO.OooO0O0(str2, str);
        OooO0oO(str);
        OooO0OO(str, str2);
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        ScrimInsetsFrameLayout scrimInsetsFrameLayout = (ScrimInsetsFrameLayout) this.f30487OooOo0o;
        if (scrimInsetsFrameLayout.f27700OooOo0o == null) {
            scrimInsetsFrameLayout.f27700OooOo0o = new Rect();
        }
        scrimInsetsFrameLayout.f27700OooOo0o.set(windowInsetsCompat.getSystemWindowInsetLeft(), windowInsetsCompat.getSystemWindowInsetTop(), windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
        scrimInsetsFrameLayout.OooO00o(windowInsetsCompat);
        scrimInsetsFrameLayout.setWillNotDraw(!windowInsetsCompat.hasSystemWindowInsets() || scrimInsetsFrameLayout.f27699OooOo0O == null);
        ViewCompat.postInvalidateOnAnimation(scrimInsetsFrameLayout);
        return windowInsetsCompat.consumeSystemWindowInsets();
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public void onCanceled() {
        ((CountDownLatch) this.f30487OooOo0o).countDown();
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        Exception exception = task.getException();
        o00O0oOo.oo0o0Oo oo0o0oo = (o00O0oOo.oo0o0Oo) this.f30487OooOo0o;
        if (exception != null) {
            oo0o0oo.resumeWith(o00O0.o000OOo.OooO0O0(exception));
        } else if (task.isCanceled()) {
            oo0o0oo.OooO0oO(null);
        } else {
            oo0o0oo.resumeWith(task.getResult());
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        ((CountDownLatch) this.f30487OooOo0o).countDown();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((CountDownLatch) this.f30487OooOo0o).countDown();
    }

    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
    public void onUserEarnedReward(RewardItem rewardItem) {
        switch (this.f30486OooOo0O) {
            case 8:
                ((o00O00O) this.f30487OooOo0o).f31155OooO0OO.onUserEarnedReward();
                break;
            default:
                ((o00oOoo.o000000) this.f30487OooOo0o).f32800OooO0OO.onUserEarnedReward();
                break;
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        if (((o000O0O0.OooO0OO) obj) == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        o000Oo0O.OooOo00 oooOo00 = (o000Oo0O.OooOo00) this.f30487OooOo0o;
        o0OOO0o.OooO00o((o0OOO0o) oooOo00.f30370OooOo);
        o0OOO0o o0ooo0o = (o0OOO0o) oooOo00.f30370OooOo;
        o0ooo0o.f30509OooOOO0.OooOoO0(o0ooo0o.f30503OooO0o0.f30099OooO00o, null);
        o0ooo0o.f30512OooOOo.trySetResult(null);
        return Tasks.forResult(null);
    }

    public /* synthetic */ o00oO0o(Object obj, int i) {
        this.f30486OooOo0O = i;
        this.f30487OooOo0o = obj;
    }

    public o00oO0o(ViewGroup viewGroup) {
        this.f30486OooOo0O = 21;
        this.f30487OooOo0o = viewGroup.getOverlay();
    }

    public o00oO0o(o000O000 o000o0002, o0000O0 o0000o02) {
        this.f30486OooOo0O = 12;
        o000OO o000oo2 = o000OO.f31626OooOo0O;
        o0000O o0000o2 = o0000O.f31594OooOo0O;
        this.f30487OooOo0o = o000o0002;
    }

    public o00oO0o(int i) {
        this.f30486OooOo0O = i;
        switch (i) {
            case 11:
                this.f30487OooOo0o = new ConcurrentHashMap(16);
                break;
            case 12:
            case 13:
            default:
                this.f30487OooOo0o = new CountDownLatch(1);
                break;
            case 14:
                this.f30487OooOo0o = new LinkedHashSet();
                break;
            case 15:
                this.f30487OooOo0o = new ArrayList(20);
                break;
        }
    }
}

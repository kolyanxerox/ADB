package OoooOOO;

import OooO0oO.Oooo0;
import OooOo0o.o000oOoO;
import Oooo00O.o000000O;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import com.google.android.gms.internal.ads.C1421bg;
import com.google.android.gms.internal.ads.C1658hx;
import com.google.android.gms.internal.ads.C1808m;
import com.google.android.gms.internal.ads.C1956q;
import com.google.android.gms.internal.ads.b30;
import com.google.android.gms.internal.ads.c60;
import com.google.android.gms.internal.ads.gn0;
import com.google.android.gms.internal.ads.i80;
import com.google.android.gms.internal.ads.j50;
import com.google.android.gms.internal.ads.la1;
import com.google.android.gms.internal.ads.lm0;
import com.google.android.gms.internal.ads.ma1;
import com.google.android.gms.internal.ads.o0OoOo0;
import com.google.android.gms.internal.ads.oOO0O0O;
import com.google.android.gms.internal.ads.oOOOoo00;
import com.google.android.gms.internal.ads.qa1;
import com.google.android.gms.internal.ads.rm0;
import com.google.android.gms.internal.ads.ua1;
import com.google.android.gms.internal.ads.xa1;
import com.google.android.gms.internal.ads.xh0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.unity3d.services.core.device.MimeTypes;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import o000O0Oo.OooO0o;
import o000Oo0.OooO;

/* loaded from: classes2.dex */
public final class o0O0oo00 implements ua1 {

    /* renamed from: OooOoO */
    public static volatile int f14467OooOoO = 1;

    /* renamed from: OooOo */
    public Object f14468OooOo;

    /* renamed from: OooOo0O */
    public boolean f14469OooOo0O;

    /* renamed from: OooOo0o */
    public final Object f14470OooOo0o;

    /* renamed from: OooOoO0 */
    public Object f14471OooOoO0;

    public o0O0oo00(Context context, ExecutorService executorService, Task task, boolean z) {
        this.f14470OooOo0o = context;
        this.f14468OooOo = executorService;
        this.f14471OooOoO0 = task;
        this.f14469OooOo0O = z;
    }

    public static o0O0oo00 OooO0O0(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager == null) {
            return null;
        }
        return new o0O0oo00(audioManager.getSpatializer());
    }

    public static o0O0oo00 OooO0OO(Context context, ExecutorService executorService, boolean z) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (z) {
            executorService.execute(new c60(10, context, taskCompletionSource));
        } else {
            executorService.execute(new b30(taskCompletionSource, 15));
        }
        return new o0O0oo00(context, executorService, taskCompletionSource.getTask(), z);
    }

    public boolean OooO(o0OoOo0 o0oooo0, j50 j50Var) throws IllegalArgumentException {
        boolean zEquals = Objects.equals(o0oooo0.f22222OooOOO0, "audio/eac3-joc");
        int i = o0oooo0.f22236OooOoo0;
        if (zEquals && i == 16) {
            i = 12;
        } else if (Objects.equals(o0oooo0.f22222OooOOO0, "audio/iamf") && i == -1) {
            i = 6;
        }
        int iOooOOO0 = i80.OooOOO0(i);
        if (iOooOOO0 == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iOooOOO0);
        int i2 = o0oooo0.f22235OooOoo;
        if (i2 != -1) {
            channelMask.setSampleRate(i2);
        }
        return ((Spatializer) this.f14470OooOo0o).canBeSpatialized((AudioAttributes) j50Var.OooO00o().f25318OooOo0o, channelMask.build());
    }

    public boolean OooO00o(String str, String str2) {
        synchronized (this) {
            try {
                if (!((OooO) ((AtomicMarkableReference) this.f14470OooOo0o).getReference()).OooO0O0(str, str2)) {
                    return false;
                }
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) this.f14470OooOo0o;
                atomicMarkableReference.set((OooO) atomicMarkableReference.getReference(), true);
                o000oOoO o000oooo2 = new o000oOoO(this, 25);
                AtomicReference atomicReference = (AtomicReference) this.f14468OooOo;
                while (!atomicReference.compareAndSet(null, o000oooo2)) {
                    if (atomicReference.get() != null) {
                        return true;
                    }
                }
                ((o000O0O.OooO) ((OooO0o) this.f14471OooOoO0).f30140OooOoO0).f30100OooO0O0.OooO00o(o000oooo2);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String OooO0Oo() {
        if (!this.f14469OooOo0O) {
            this.f14469OooOo0O = true;
            this.f14468OooOo = ((o0O) this.f14471OooOoO0).OooOOOO().getString((String) this.f14470OooOo0o, null);
        }
        return (String) this.f14468OooOo;
    }

    @Override // com.google.android.gms.internal.ads.ua1
    public gn0 OooO0o(int i, C1421bg c1421bg, int[] iArr) {
        la1 la1Var = new la1((xa1) this.f14470OooOo0o);
        int i2 = ((int[]) this.f14471OooOoO0)[i];
        xh0.OooOOoo(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i3 = 0;
        int i4 = 0;
        while (i3 < c1421bg.f17492OooO00o) {
            int i5 = i;
            C1421bg c1421bg2 = c1421bg;
            ma1 ma1Var = new ma1(i5, c1421bg2, i3, (qa1) this.f14468OooOo, iArr[i3], this.f14469OooOo0O, la1Var);
            int length = objArrCopyOf.length;
            int i6 = i4 + 1;
            int iOooO0o = lm0.OooO0o(length, i6);
            if (iOooO0o > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iOooO0o);
            }
            objArrCopyOf[i4] = ma1Var;
            i3++;
            i4 = i6;
            i = i5;
            c1421bg = c1421bg2;
        }
        return rm0.OooOOO(i4, objArrCopyOf);
    }

    public void OooO0o0(String str) {
        SharedPreferences.Editor editorEdit = ((o0O) this.f14471OooOoO0).OooOOOO().edit();
        editorEdit.putString((String) this.f14470OooOo0o, str);
        editorEdit.apply();
        this.f14468OooOo = str;
    }

    public void OooO0oO(int i, long j, Exception exc) {
        OooOO0(i, j, exc, null, null);
    }

    public void OooO0oo(int i, long j) {
        OooOO0(i, j, null, null, null);
    }

    public Task OooOO0(int i, long j, Exception exc, String str, String str2) {
        if (!this.f14469OooOo0O) {
            return ((Task) this.f14471OooOoO0).continueWith((ExecutorService) this.f14468OooOo, new C1658hx(26, (byte) 0));
        }
        Context context = (Context) this.f14470OooOo0o;
        C1808m c1808mOooOo0o = C1956q.OooOo0o();
        String packageName = context.getPackageName();
        c1808mOooOo0o.OooO0Oo();
        C1956q.OooOo((C1956q) c1808mOooOo0o.f25822OooOo0o, packageName);
        c1808mOooOo0o.OooO0Oo();
        C1956q.OooOoo0((C1956q) c1808mOooOo0o.f25822OooOo0o, j);
        int i2 = f14467OooOoO;
        c1808mOooOo0o.OooO0Oo();
        C1956q.OooOooO((C1956q) c1808mOooOo0o.f25822OooOo0o, i2);
        if (exc != null) {
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            String string = stringWriter.toString();
            c1808mOooOo0o.OooO0Oo();
            C1956q.OooOoo((C1956q) c1808mOooOo0o.f25822OooOo0o, string);
            String name = exc.getClass().getName();
            c1808mOooOo0o.OooO0Oo();
            C1956q.OooOoOO((C1956q) c1808mOooOo0o.f25822OooOo0o, name);
        }
        if (str2 != null) {
            c1808mOooOo0o.OooO0Oo();
            C1956q.OooOoO0((C1956q) c1808mOooOo0o.f25822OooOo0o, str2);
        }
        if (str != null) {
            c1808mOooOo0o.OooO0Oo();
            C1956q.OooOoO((C1956q) c1808mOooOo0o.f25822OooOo0o, str);
        }
        return ((Task) this.f14471OooOoO0).continueWith((ExecutorService) this.f14468OooOo, new Oooo0(c1808mOooOo0o, i, 7));
    }

    public o0O0oo00(oOOOoo00 oooooo00) {
        this.f14469OooOo0O = false;
        this.f14470OooOo0o = null;
        this.f14468OooOo = null;
        this.f14471OooOoO0 = oooooo00;
    }

    public /* synthetic */ o0O0oo00(xa1 xa1Var, qa1 qa1Var, boolean z, int[] iArr) {
        this.f14470OooOo0o = xa1Var;
        this.f14468OooOo = qa1Var;
        this.f14469OooOo0O = z;
        this.f14471OooOoO0 = iArr;
    }

    public o0O0oo00(Object obj, oOO0O0O ooo0o0o) {
        this.f14469OooOo0O = false;
        this.f14470OooOo0o = obj;
        this.f14468OooOo = ooo0o0o;
        this.f14471OooOoO0 = null;
    }

    public o0O0oo00(o0O o0o, String str) {
        Objects.requireNonNull(o0o);
        this.f14471OooOoO0 = o0o;
        o000000O.OooO0o0(str);
        this.f14470OooOo0o = str;
    }

    public o0O0oo00(Spatializer spatializer) {
        this.f14470OooOo0o = spatializer;
        this.f14469OooOo0O = spatializer.getImmersiveAudioLevel() != 0;
    }

    public o0O0oo00(OooO0o oooO0o, boolean z) {
        this.f14471OooOoO0 = oooO0o;
        this.f14468OooOo = new AtomicReference(null);
        this.f14469OooOo0O = z;
        this.f14470OooOo0o = new AtomicMarkableReference(new OooO(z ? 8192 : 1024), false);
    }
}

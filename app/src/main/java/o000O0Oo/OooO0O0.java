package o000O0Oo;

import OooO0oO.OooOo;
import OooOOOo.o0ooOOo;
import Oooo0oO.o0000Ooo;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.o000O0O0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import o000O00.o0o0Oo;
import o000Ooo.o00Ooo;

/* loaded from: classes2.dex */
public final class OooO0O0 {

    /* renamed from: OooO00o */
    public final AtomicInteger f30131OooO00o = new AtomicInteger(0);

    /* renamed from: OooO0O0 */
    public final OooO0o f30132OooO0O0;

    /* renamed from: OooO0OO */
    public final o0ooOOo f30133OooO0OO;

    /* renamed from: OooO0Oo */
    public final o00Ooo f30134OooO0Oo;

    /* renamed from: OooO0o0 */
    public static final Charset f30128OooO0o0 = Charset.forName("UTF-8");

    /* renamed from: OooO0o */
    public static final int f30127OooO0o = 15;

    /* renamed from: OooO0oO */
    public static final o000O00O.OooO00o f30129OooO0oO = new o000O00O.OooO00o();

    /* renamed from: OooO0oo */
    public static final o000O0O0 f30130OooO0oo = new o000O0O0(1);

    /* renamed from: OooO */
    public static final OooO00o f30126OooO = new OooO00o(0);

    public OooO0O0(OooO0o oooO0o, o0ooOOo o0ooooo, o00Ooo o00ooo2) {
        this.f30132OooO0O0 = oooO0o;
        this.f30133OooO0OO = o0ooooo;
        this.f30134OooO0Oo = o00ooo2;
    }

    public static void OooO00o(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static void OooO0o(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f30128OooO0o0);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String OooO0o0(File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i = fileInputStream.read(bArr);
                if (i <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f30128OooO0o0);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public final ArrayList OooO0O0() {
        ArrayList arrayList = new ArrayList();
        OooO0o oooO0o = this.f30132OooO0O0;
        arrayList.addAll(OooO0o.OooOo(((File) oooO0o.f30143OooOoo0).listFiles()));
        arrayList.addAll(OooO0o.OooOo(((File) oooO0o.f30142OooOoo).listFiles()));
        o000O0O0 o000o0o02 = f30130OooO0oo;
        Collections.sort(arrayList, o000o0o02);
        List listOooOo = OooO0o.OooOo(((File) oooO0o.f30141OooOoOO).listFiles());
        Collections.sort(listOooOo, o000o0o02);
        arrayList.addAll(listOooOo);
        return arrayList;
    }

    public final NavigableSet OooO0OO() {
        return new TreeSet(OooO0o.OooOo(((File) this.f30132OooO0O0.f30139OooOoO).list())).descendingSet();
    }

    public final void OooO0Oo(o0o0Oo o0o0oo, String str, boolean z) {
        OooO0o oooO0o = this.f30132OooO0O0;
        o0000Ooo o0000ooo = this.f30133OooO0OO.OooO0O0().f30119OooO00o;
        f30129OooO0oO.getClass();
        try {
            OooO0o(oooO0o.OooOOOO(str, OooOo.OooOO0O(NotificationCompat.CATEGORY_EVENT, String.format(Locale.US, "%010d", Integer.valueOf(this.f30131OooO00o.getAndIncrement())), z ? "_" : "")), o000O00O.OooO00o.f30097OooO00o.OooO00o(o0o0oo));
        } catch (IOException e) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e);
        }
        OooO00o oooO00o = new OooO00o(1);
        oooO0o.getClass();
        File file = new File((File) oooO0o.f30139OooOoO, str);
        file.mkdirs();
        List<File> listOooOo = OooO0o.OooOo(file.listFiles(oooO00o));
        Collections.sort(listOooOo, new o000O0O0(2));
        int size = listOooOo.size();
        for (File file2 : listOooOo) {
            if (size <= o0000ooo.f13884OooOo0o) {
                return;
            }
            OooO0o.OooOo0o(file2);
            size--;
        }
    }
}

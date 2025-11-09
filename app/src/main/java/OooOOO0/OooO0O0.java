package OooOOO0;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes2.dex */
public final class OooO0O0 implements FilenameFilter {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ String f13320OooO00o;

    public OooO0O0(String str) {
        this.f13320OooO00o = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith(this.f13320OooO00o);
    }
}

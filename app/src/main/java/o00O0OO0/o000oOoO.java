package o00O0Oo0;

import java.io.File;

/* loaded from: classes3.dex */
public final class o000oOoO extends OooOo {

    /* renamed from: OooO0O0 */
    public boolean f31386OooO0O0;

    /* renamed from: OooO0OO */
    public File[] f31387OooO0OO;

    /* renamed from: OooO0Oo */
    public int f31388OooO0Oo;

    /* renamed from: OooO0o0 */
    public final /* synthetic */ o0OoOo0 f31389OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000oOoO(o0OoOo0 o0oooo0, File rootDir) {
        super(rootDir);
        kotlin.jvm.internal.OooOo.OooO0o0(rootDir, "rootDir");
        this.f31389OooO0o0 = o0oooo0;
    }

    @Override // o00O0Oo0.o00O0O
    public final File OooO00o() {
        boolean z = this.f31386OooO0O0;
        File file = this.f31390OooO00o;
        o0OoOo0 o0oooo0 = this.f31389OooO0o0;
        if (!z) {
            ((o00Oo0) o0oooo0.f31402OooOoO).getClass();
            this.f31386OooO0O0 = true;
            return file;
        }
        File[] fileArr = this.f31387OooO0OO;
        if (fileArr != null && this.f31388OooO0Oo >= fileArr.length) {
            ((o00Oo0) o0oooo0.f31402OooOoO).getClass();
            return null;
        }
        if (fileArr == null) {
            File[] fileArrListFiles = file.listFiles();
            this.f31387OooO0OO = fileArrListFiles;
            if (fileArrListFiles == null) {
                ((o00Oo0) o0oooo0.f31402OooOoO).getClass();
            }
            File[] fileArr2 = this.f31387OooO0OO;
            if (fileArr2 == null || fileArr2.length == 0) {
                ((o00Oo0) o0oooo0.f31402OooOoO).getClass();
                return null;
            }
        }
        File[] fileArr3 = this.f31387OooO0OO;
        kotlin.jvm.internal.OooOo.OooO0O0(fileArr3);
        int i = this.f31388OooO0Oo;
        this.f31388OooO0Oo = i + 1;
        return fileArr3[i];
    }
}

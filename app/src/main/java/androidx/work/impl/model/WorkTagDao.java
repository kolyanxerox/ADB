package androidx.work.impl.model;

import java.util.List;

/* loaded from: classes.dex */
public interface WorkTagDao {
    List<String> getTagsForWorkSpecId(String str);

    List<String> getWorkSpecIdsWithTag(String str);

    void insert(WorkTag workTag);
}

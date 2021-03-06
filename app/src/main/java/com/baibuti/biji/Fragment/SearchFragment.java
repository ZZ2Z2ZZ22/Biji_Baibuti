package com.baibuti.biji.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.baibuti.biji.R;

public class SearchFragment extends Fragment implements View.OnClickListener {

//    private Data mainData;
//
//    private com.getbase.floatingactionbutton.FloatingActionsMenu mFab;
//    private SwipeRefreshLayout mSwipeRefresh;
//    private ListView mNoteListView;
//    private ArrayList<Note> NoteList;
//    private com.getbase.floatingactionbutton.FloatingActionButton mAddDocMenu;
//    private com.getbase.floatingactionbutton.FloatingActionButton mAddMdMenu;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_searchtab, container, false);

//        mFab = view.findViewById(R.id.id_note_addfab);
//        mSwipeRefresh = view.findViewById(R.id.swipe_refresh);
//        mNoteListView = view.findViewById(R.id.id_note_notelistview);
//        mAddDocMenu = view.findViewById(R.id.id_note_addfab_addDoc);
//        mAddMdMenu = view.findViewById(R.id.id_note_addfab_addMd);
//
//        mSwipeRefresh.setColorSchemeResources(R.color.colorPrimary);
//        mSwipeRefresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
//            @Override
//            public void onRefresh() {
//                refreshdata();
//            }
//        });
//
//        mAddDocMenu.setOnClickListener(this);
//        mAddMdMenu.setOnClickListener(this);
//
//        initData();

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
//            case R.id.id_note_addfab_addDoc:
//
//                Intent addDoc_intent=new Intent(getActivity(),ModifyNoteActivity.class);
//                addDoc_intent.putExtra("notedata",new Note("",""));
//                startActivityForResult(addDoc_intent,2);
//                break;
//            case R.id.id_note_addfab_addMd:
//                Intent addMd_intent=new Intent(getActivity(),ModifyNoteActivity.class);
//                addMd_intent.putExtra("notedata",new Note("",""));
//                startActivityForResult(addMd_intent,2);
//                break;
        }
    }

//    private int NoteListClickPos;
//
//    private NoteAdapter noteAdapter;
//
//    private void initData() {
//        mainData = Data.getData();
//
//        NoteList = mainData.getNote();
//
//        noteAdapter = new NoteAdapter(getActivity(), R.layout.notelistview, NoteList,this);
//        mNoteListView.setAdapter(noteAdapter);
//
//        mNoteListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Note note = NoteList.get(position);
//                NoteListClickPos = position;
//
//                Intent intent=new Intent(getActivity(),ModifyNoteActivity.class);
//                intent.putExtra("notedata",note);
//                startActivityForResult(intent,1);
//
//            }
//        });
//    }
//
//    private void refreshdata() {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                getActivity().runOnUiThread(new Runnable() {
//                    @Override
//                    public void run() {
//                        initData();
//                        noteAdapter.notifyDataSetChanged();
//                        mSwipeRefresh.setRefreshing(false);
//                    }
//                });
//            }
//        }).start();
//    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
//        switch (requestCode) {
//            case 1:
//                if (resultCode == RESULT_OK) {
//                    if (data.getBooleanExtra("intent_result", true)) {
//                        Note newnote = (Note) data.getSerializableExtra("modify_note");
//                        NoteList.set(NoteListClickPos,newnote);
//
//                        mainData.setNoteItem(NoteListClickPos, newnote);
//
//                        noteAdapter.notifyDataSetChanged();
//                    }
//                    break;
//                }
//            case 2:
//                if (resultCode == RESULT_OK) {
//                    if (data.getBooleanExtra("intent_result", true)) {
//                        Note newnote = (Note) data.getSerializableExtra("modify_note");
//                        Toast.makeText(getActivity(), newnote.getTitle(), Toast.LENGTH_SHORT).show();
//                        NoteList.add(NoteList.size(), newnote);
//                        // Log.i("si", String.valueOf(mainData.getNote().size()));
//                        noteAdapter.notifyDataSetChanged();
//                    }
//                }
//                break;
//        }
    }


}

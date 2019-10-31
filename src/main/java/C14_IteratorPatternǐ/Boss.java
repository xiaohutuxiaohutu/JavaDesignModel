package C14_IteratorPatternǐ;

import java.util.ArrayList;
import java.util.List;

public class Boss {
    public static void main(String[] args) {
        List<IProject> list =new ArrayList<>();
        list.add(new Project("project1",10,100000));
        list.add(new Project("project2",100,1000000));
        list.add(new Project("project3",1000,10000000));
        for(IProject proj:list){
            System.out.println(proj.getProjectInfo());
        }

        IProject project=new Project();
        project.add("project1",10,100000);
        project.add("project1",100,10000000);
        project.add("project1",1000,100000000);
        IProjectIterator iterator = project.iterator();
        while (iterator.hasNext()){
            IProject next = iterator.next();
            System.out.println(next.getProjectInfo());

        }
    }
}

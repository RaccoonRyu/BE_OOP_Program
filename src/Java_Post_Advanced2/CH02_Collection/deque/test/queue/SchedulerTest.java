package Java_Post_Advanced2.CH02_Collection.deque.test.queue;

public class SchedulerTest {
    public static void main(String[] args) {
        // 낮에 작업 저장
        TaskScheduler scheduler = new TaskScheduler();
        scheduler.addTask(new CompressionTask());
        scheduler.addTask(new BackUpTask());
        scheduler.addTask(new CleanTask());

        // 새벽 시간에 실행
        System.out.println("작업 시작");
        run(scheduler);
        System.out.println("작업 완료");
    }

    private static void run(TaskScheduler scheduler) {
        while (scheduler.getRemainingTasks() > 0) {
            scheduler.processNextTask();
        }
    }
}

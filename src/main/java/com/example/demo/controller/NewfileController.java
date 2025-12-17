@RestController
class NewfileController {
    private final NewfileServiceImpl fileService;

    public NewfileController(NewfileServiceImpl fileService) {
        this.fileService = fileService;
    }

    @Getmapping("/getData/{id}")
    public NewfileEntity getStudent(@PathVariable Long id) {
        return fileService.getidval(id);
    }

    @PostMapping("/postData")
    public NewfileEntity postStudentData(NewfileEntity entity) {
        return fileService.savedata(entity);
    }
}